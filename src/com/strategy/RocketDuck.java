package com.strategy;

public class RocketDuck extends Duck implements Flyable{

    public RocketDuck() {
        flyable = new FlyRocket();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        flyable.fly();
        quackBehavior.quack();
    }

    @Override
    public void fly() {

    }
}
