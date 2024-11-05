package DesignPatterns.FactoryDesignPattern.AbstractFactory;

import DesignPatterns.FactoryDesignPattern.AbstractFactory.Factory.LuxuryVehicleFactory;
import DesignPatterns.FactoryDesignPattern.AbstractFactory.Factory.OrdinaryVehicleFactory;
import DesignPatterns.FactoryDesignPattern.AbstractFactory.Factory.VehicleFactory;
import DesignPatterns.FactoryDesignPattern.AbstractFactory.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Create specific factories
        VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
        VehicleFactory ordinaryFactory = new OrdinaryVehicleFactory();

        // Create luxury vehicles
        Vehicle luxuryCar1 = luxuryFactory.createVehicle("Mercedes S-Class");
        Vehicle luxuryCar2 = luxuryFactory.createVehicle("BMW 7 Series");

        // Create ordinary vehicles
        Vehicle ordinaryCar1 = ordinaryFactory.createVehicle("Toyota Corolla");
        Vehicle ordinaryCar2 = ordinaryFactory.createVehicle("Honda Civic");

        // Drive the vehicles
        luxuryCar1.drive();
        luxuryCar2.drive();
        ordinaryCar1.drive();
        ordinaryCar2.drive();
    }
}
