package com.tyler.lab5;

import java.util.ArrayList;
import java.util.List;


public class AddressBook {

    private long id;

    private String title = "Default Title";
    private List<BuddyInfo> buds = new ArrayList<>();

    //---

    public void addBuddy(BuddyInfo bud) {
        buds.add(bud);
    }

    public void addBuddy(String name) {
        BuddyInfo bud = new BuddyInfo();
        bud.setName(name);
        buds.add(bud);
    }

    public boolean delBuddy(BuddyInfo bud) {
        boolean result = buds.remove(bud);
        return result;
    }

    public void delFirstBuddy(){
        if (!buds.isEmpty()){
            buds.remove(0);
        }
    }

    //---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<BuddyInfo> getBuds() {
        return buds;
    }

    public void setBuds(List<BuddyInfo> buds) {
        this.buds = buds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "title='" + title + '\'' +
                ", buds=" + buds +
                '}';
    }
}
