package com.tyler.lab5;

import java.util.List;

public interface BuddyInfoService {

    List<BuddyInfo> findAll();

    void saveAll(List<BuddyInfo> buds);
}
