package com.strategy;

public class AxeWeapon implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("pick up a axe weapon");
    }
}
