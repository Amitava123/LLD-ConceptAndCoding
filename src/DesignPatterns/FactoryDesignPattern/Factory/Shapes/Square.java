package DesignPatterns.FactoryDesignPattern.Factory.Shapes;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("I am a Square!");
    }
}
