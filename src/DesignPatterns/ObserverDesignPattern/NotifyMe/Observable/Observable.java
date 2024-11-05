package DesignPatterns.ObserverDesignPattern.NotifyMe.Observable;

import DesignPatterns.ObserverDesignPattern.NotifyMe.Observer.Observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();
    void setData(int data);
    int getData();
}
