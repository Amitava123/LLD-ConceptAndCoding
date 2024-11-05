package DesignPatterns.StrategyDesignPattern.Without;

public class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Special Drive Implementation!");
    }
}
