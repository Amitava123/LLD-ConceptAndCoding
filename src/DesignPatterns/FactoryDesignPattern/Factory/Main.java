package DesignPatterns.FactoryDesignPattern.Factory;

import DesignPatterns.FactoryDesignPattern.Factory.Shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shapeObj = factory.getShape("CIRCLE");
        shapeObj.draw();
    }
}
