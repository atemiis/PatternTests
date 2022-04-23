package com.observer;

public class StaticDisplay implements Observer, displayElement{
    private DataCenter dt;
    private double temp, humidity;

    public StaticDisplay(DataCenter dt){
        this.dt = dt;
        dt.registredObserver(this);
    }

    @Override
    public void Update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;

        display();
    }

    @Override
    public String toString() {
        return "StaticDisplay{" +
                "temp = " + temp +
                ", humidity = " + humidity +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
