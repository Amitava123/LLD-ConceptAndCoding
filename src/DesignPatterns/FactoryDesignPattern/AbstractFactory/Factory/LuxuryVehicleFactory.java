package DesignPatterns.FactoryDesignPattern.AbstractFactory.Factory;

import DesignPatterns.FactoryDesignPattern.AbstractFactory.Vehicle.LuxuryVehicle;
import DesignPatterns.FactoryDesignPattern.AbstractFactory.Vehicle.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String name) {
        return new LuxuryVehicle(name);
    }
}
