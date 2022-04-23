package com.observer;

import java.util.Random;

public class CurrenDisplay implements Observer, displayElement{
    private DataCenter td;
    private double temp, humidity, pressure;
    private int id = 0;
    Random rand = new Random();

    public CurrenDisplay(DataCenter td) {
        id = rand.nextInt(1000);
        this.td = td;
        td.registredObserver(this);
    }

    @Override
    public void Update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public String toString() {
        return "CurrenDisplay{" +
                "temp = " + temp +
                ", humidity = " + humidity +
                ", pressure = " + pressure +
                ", Display id = " + id +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
