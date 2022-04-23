package com.observer;

public interface Subject {
    public void registredObserver(Observer o);
    public void removeObsrver(Observer o);
    public void notifyObserves();
}
