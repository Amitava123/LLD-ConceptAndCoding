package DesignPatterns.FactoryDesignPattern.AbstractFactory.Vehicle;

public class OrdinaryVehicle implements Vehicle {
    private String name;

    public OrdinaryVehicle(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Driving an ordinary vehicle: " + name);
    }
}
