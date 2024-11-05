package DesignPatterns.ObserverDesignPattern.NotifyMe.Observer;

import DesignPatterns.ObserverDesignPattern.NotifyMe.Observable.Observable;

public class EmailObserver implements Observer {
    Observable observable;
    String email;

    public EmailObserver(String email, Observable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        int newStock = observable.getData();
        System.out.println("Email Sent to email id: " + this.email);
    }
}
