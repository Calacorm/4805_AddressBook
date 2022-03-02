package com.tyler.lab5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/addressbook")
public class AddressBookController {

    private BuddyInfoService buddyInfoService = new InMemAddressBookService();

    @GetMapping(value = "/all")
    public String showAll(Model model) {
        model.addAttribute("buds", buddyInfoService.findAll());

        return "addressBookForm";
    }

    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        AddressBookCreationDto budForm = new AddressBookCreationDto();
        budForm.addBud(new BuddyInfo());
        model.addAttribute("form", budForm);
        return "createBudsForm";
    }

    private void collectBuds(Model model){
        List<BuddyInfo> buds = new ArrayList<>();
        buddyInfoService.findAll()
                .iterator()
                .forEachRemaining(buds::add);
        model.addAttribute("form", new AddressBookCreationDto(buds));
    }

    @GetMapping(value = "/edit")
    public String showEditForm(Model model) {
        collectBuds(model);
        return "editBudsForm";
    }

    @PostMapping(value = "/save")
    public String saveBuds(@ModelAttribute AddressBookCreationDto form, Model model) {
        buddyInfoService.saveAll(form.getBuds());
        model.addAttribute("buds", buddyInfoService.findAll());
        return "addressBookForm";
    }


}