package com.strategy;

public abstract class Duck {
    Flyable flyable;
    QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("let's swimming!");
    }

    public void performFly(){
        flyable.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public abstract void display();

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
