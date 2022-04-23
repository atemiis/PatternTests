package com.observer;

import java.util.ArrayList;
import java.util.List;

public class DataCenter implements Subject{
    private List<Observer> observerList;
    private double temp, humidity, pressure;
    private boolean changed = false;

    public DataCenter() {
        this.observerList = new ArrayList<>();
    }

    public void putData(double t, double h, double p){
        temp = t;
        humidity = h;
        pressure = p;

        measurementChanged();
    }

    @Override
    public void registredObserver(Observer o) {
        observerList.add(o);
    }

    public void measurementChanged(){
        setChanged();
        notifyObserves();
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
            for (Observer observer : observerList) {
                observer.Update(temp, humidity, pressure);
            }
            changed = false;
        }
    }

    private void setChanged() {
        if (changed){
            changed = false;
        } else changed = true;
    }
}
