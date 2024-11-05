package DesignPatterns.ObserverDesignPattern.Example.Observable;

import DesignPatterns.ObserverDesignPattern.Example.Observer.Observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();
    void setData(int data);
    int getData();
}
