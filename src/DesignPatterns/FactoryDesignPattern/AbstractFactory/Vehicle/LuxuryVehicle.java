package DesignPatterns.FactoryDesignPattern.AbstractFactory.Vehicle;

public class LuxuryVehicle implements Vehicle {
    private String name;

    public LuxuryVehicle(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Driving a luxury vehicle: " + name);
    }
}
