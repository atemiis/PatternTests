package com.decorator;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        this.size = size;
        description = "Espresso" + ", coap size " + this.size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
