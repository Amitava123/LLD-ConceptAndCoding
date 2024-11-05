package DesignPatterns.StrategyDesignPattern.With;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalDrive());
    }
}
