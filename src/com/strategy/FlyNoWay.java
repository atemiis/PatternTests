package com.strategy;

public class FlyNoWay implements Flyable {
    @Override
    public void fly() {
        System.out.println("non flay..");
    }
}
