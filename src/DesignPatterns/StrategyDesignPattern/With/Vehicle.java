package DesignPatterns.StrategyDesignPattern.With;

public class Vehicle {
    DriveStrategy dsObj;

    Vehicle(DriveStrategy obj) {
        this.dsObj = obj;
    }
}
