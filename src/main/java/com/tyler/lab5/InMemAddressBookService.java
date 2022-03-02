package com.tyler.lab5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InMemAddressBookService implements BuddyInfoService {

    static Map<Long, BuddyInfo> buddyInfosDB = new HashMap<>();

    @Override
    public List<BuddyInfo> findAll() {
        return new ArrayList<>(buddyInfosDB.values());
    }

    @Override
    public void saveAll(List<BuddyInfo> buds) {
        long nextId = getNextId();
        for (BuddyInfo bud : buds) {
            if (bud.getId() == 0) {
                bud.setId(nextId++);
            }
        }

        Map<Long, BuddyInfo> budsMap = buds.stream()
                .collect(Collectors.toMap(BuddyInfo::getId, Function.identity()));

        buddyInfosDB.putAll(budsMap);
    }

    private Long getNextId() {
        return buddyInfosDB.keySet()
                .stream()
                .mapToLong(value -> value)
                .max()
                .orElse(0) + 1;
    }
}
