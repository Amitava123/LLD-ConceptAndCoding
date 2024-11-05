package DesignPatterns.ObserverDesignPattern.Example.Observable;

import DesignPatterns.ObserverDesignPattern.Example.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableClass implements Observable {
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
        for (Observer ob : observerList) {
            ob.update();
        }
    }

    @Override
    public void setData(int data) {
        this.data = data;
        notifyAll();
    }

    @Override
    public int getData() {
        return data;
    }
}
