package com.javacoloss.weaponstore;

import com.javacoloss.weaponstore.models.Weapon;
import com.javacoloss.weaponstore.models.WeaponStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        WeaponStorage.getWeapons().add(new Weapon("AKM", 7.62, 30));
        WeaponStorage.getWeapons().add(new Weapon("M4A1", 5.56, 30));

        SpringApplication.run(MainApplication.class, args);
    }
}
