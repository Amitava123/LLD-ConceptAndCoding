package DesignPatterns.ObserverDesignPattern.Example.Observer;

import DesignPatterns.ObserverDesignPattern.Example.Observable.Observable;

public class ObserverClass implements Observer {
    Observable observable;

    ObserverClass(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        observable.getData();
        // Other Implementation
    }
}
