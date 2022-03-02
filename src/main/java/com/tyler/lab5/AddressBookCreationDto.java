package com.tyler.lab5;

import java.util.ArrayList;
import java.util.List;

public class AddressBookCreationDto {

        private List<BuddyInfo> buddys;

        public AddressBookCreationDto() {
            this.buddys = new ArrayList<>();
        }

        public AddressBookCreationDto(List<BuddyInfo> buds) {
            this.buddys = buds;
        }

        public List<BuddyInfo> getBuds() {
            return buddys;
        }

        public void setBuds(List<BuddyInfo> buds) {
            this.buddys = buds;
        }

        public void addBud(BuddyInfo bud) {
            this.buddys.add(bud);
        }

}
