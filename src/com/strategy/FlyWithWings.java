package com.strategy;

public class FlyWithWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("Летим с крыльями");
    }
}
