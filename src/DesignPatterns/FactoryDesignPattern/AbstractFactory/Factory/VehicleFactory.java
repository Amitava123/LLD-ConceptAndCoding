package DesignPatterns.FactoryDesignPattern.AbstractFactory.Factory;

import DesignPatterns.FactoryDesignPattern.AbstractFactory.Vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String name);
}
