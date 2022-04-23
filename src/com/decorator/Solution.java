package com.decorator;

public class Solution {
    public static void main(String[] args) {
        Beverage dc = new Decaf();
        System.out.println(dc.getDescription() + ", " + dc.cost());

        Beverage espresso = new Espresso(Beverage.Size.GRANDE);

        espresso = new Whip(espresso);

        System.out.println("Description: " + espresso.getDescription() + ", cost per " + espresso.cost());
    }
}
