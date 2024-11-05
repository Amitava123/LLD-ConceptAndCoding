package DesignPatterns.ObserverDesignPattern.NotifyMe;

import DesignPatterns.ObserverDesignPattern.NotifyMe.Observable.Observable;
import DesignPatterns.ObserverDesignPattern.NotifyMe.Observable.iPhoneObservable;
import DesignPatterns.ObserverDesignPattern.NotifyMe.Observer.EmailObserver;
import DesignPatterns.ObserverDesignPattern.NotifyMe.Observer.Observer;
import DesignPatterns.ObserverDesignPattern.NotifyMe.Observer.SMSObserver;

public class DriverClass {
    public static void main(String[] args) {
        Observable observable = new iPhoneObservable();

        Observer observer1 = new EmailObserver("xyz@gmail.com", observable);
        Observer observer2 = new EmailObserver("abc@gmail.com", observable);
        Observer observer3 = new SMSObserver("+917890765678", observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setData(10);
        observable.setData(0);
        observable.setData(100);
    }
}
