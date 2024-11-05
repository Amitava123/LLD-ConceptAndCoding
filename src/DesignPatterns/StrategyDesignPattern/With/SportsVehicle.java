package DesignPatterns.StrategyDesignPattern.With;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SpecialDrive());
    }
}
