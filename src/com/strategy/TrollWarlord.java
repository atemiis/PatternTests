package com.strategy;

public class TrollWarlord extends Charcter {
    public TrollWarlord() {
        this.weaponBehavior = new AxeWeapon();
    }

    @Override
    public void fight() {
        System.out.print("Troll: ");
        weaponBehavior.useWeapon();
    }
}
