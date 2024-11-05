package DesignPatterns.ObserverDesignPattern.NotifyMe.Observer;

import DesignPatterns.ObserverDesignPattern.NotifyMe.Observable.Observable;

public class SMSObserver implements Observer {
    Observable observable;
    String number;

    public SMSObserver(String number, Observable observable){
        this.number = number;
        this.observable = observable;
    }

    @Override
    public void update() {
        int newStock = observable.getData();
        System.out.println("SMS Sent to Phone: " + this.number);
    }
}
