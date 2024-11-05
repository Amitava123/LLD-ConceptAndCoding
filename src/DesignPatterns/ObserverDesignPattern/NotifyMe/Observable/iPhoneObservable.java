package DesignPatterns.ObserverDesignPattern.NotifyMe.Observable;

import DesignPatterns.ObserverDesignPattern.NotifyMe.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class iPhoneObservable implements Observable{
    private final List<Observer> observerList = new ArrayList<>();
    private int data;

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer obs: observerList) {
            obs.update();
        }
    }

    @Override
    public void setData(int data) {
        this.data = data;
        if(this.data > 0){
            notifyAllObservers();
        }
    }

    @Override
    public int getData() {
        return data;
    }
}
