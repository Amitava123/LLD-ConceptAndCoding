package DesignPatterns.FactoryDesignPattern.AbstractFactory.Factory;

import DesignPatterns.FactoryDesignPattern.AbstractFactory.Vehicle.OrdinaryVehicle;
import DesignPatterns.FactoryDesignPattern.AbstractFactory.Vehicle.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String name) {
        return new OrdinaryVehicle(name);
    }
}
