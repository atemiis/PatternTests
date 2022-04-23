package com.observer;

import java.util.ArrayList;
import java.util.List;

public class DataCenter implements Subject{
    private List<Observer> observerList;
    private double temp, humidity, pressure;
    private boolean changed;

    public DataCenter() {
        this.observerList = new ArrayList<>();
    }

    public void putData(double t, double h, double p){
        temp = t;
        humidity = h;
        pressure = p;

        changed = true;
        notifyObserves();
    }

    @Override
    public void registredObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObsrver(Observer o) {
        if(observerList.indexOf(o) > 0){
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObserves() {
        if (changed){
            for (int i = 0; i < observerList.size(); i++) {
                Observer observer = observerList.get(i);

                observer.Update(temp, humidity, pressure);
            }
        }
    }
}
