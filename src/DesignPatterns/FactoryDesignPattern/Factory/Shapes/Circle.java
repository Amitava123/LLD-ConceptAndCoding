package DesignPatterns.FactoryDesignPattern.Factory.Shapes;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("I am a Circle!");
    }
}
