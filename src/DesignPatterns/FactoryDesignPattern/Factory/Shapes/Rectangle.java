package DesignPatterns.FactoryDesignPattern.Factory.Shapes;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("I am a Rectangle!");
    }
}
