package DesignPatterns.StrategyDesignPattern.With;

public class NormalDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Implementation!");
    }
}
