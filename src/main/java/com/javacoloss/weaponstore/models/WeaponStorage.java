package com.javacoloss.weaponstore.models;

import java.util.ArrayList;
import java.util.List;

public class WeaponStorage {
    private static List<Weapon> weapons = new ArrayList<>();

    public static List<Weapon> getWeapons() {
        return weapons;
    }
}
