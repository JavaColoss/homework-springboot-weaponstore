package com.javacoloss.weaponstore.models;

public class Weapon {
    private String name;
    private double caliber;
    private int magCapacity;

    public Weapon() {
    }

    public Weapon(String name, double caliber, int magCapacity) {
        this.name = name;
        this.caliber = caliber;
        this.magCapacity = magCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(long caliber) {
        this.caliber = caliber;
    }

    public int getMagCapacity() {
        return magCapacity;
    }

    public void setMagCapacity(int magCapacity) {
        this.magCapacity = magCapacity;
    }
}

