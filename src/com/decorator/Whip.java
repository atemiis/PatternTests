package com.decorator;

public class Whip extends Beverage{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double costPerWhip = .10;

        if(beverage.getSize() == Size.GRANDE) costPerWhip = .15;
        if(beverage.getSize() == Size.VENTI) costPerWhip = .20;

        return beverage.cost() + costPerWhip;
    }
}
