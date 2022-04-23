package com.strategy;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Quack();
        flyable = new FlyNoWay();
    }

    @Override
    public void display() {
        quackBehavior.quack();
        flyable.fly();
    }
}
