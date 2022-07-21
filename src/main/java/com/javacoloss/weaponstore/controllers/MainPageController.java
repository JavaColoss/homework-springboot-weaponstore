package com.javacoloss.weaponstore.controllers;

import com.javacoloss.weaponstore.models.WeaponStorage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
public class MainPageController {

    @RequestMapping("/")
    public String index() {
        return "Choose your weapon!";
    }

    @RequestMapping("/weapons")
    public String weapons() {
        return WeaponStorage.getWeapons().stream().
                map(book -> book.getName() + " - " + book.getCaliber()).
                collect(Collectors.joining("<br>"));
    }
}
