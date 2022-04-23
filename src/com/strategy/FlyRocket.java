package com.strategy;

public class FlyRocket implements Flyable{
    int timer = 3, i = timer+1;
    @Override
    public void fly() {
        try {
            while (i > 0){
                Thread.sleep(1000);
                System.out.printf("%d \n", i-=1);
            }
            System.out.println("Let's go!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
