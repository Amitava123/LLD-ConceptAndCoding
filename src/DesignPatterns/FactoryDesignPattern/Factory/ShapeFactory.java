package DesignPatterns.FactoryDesignPattern.Factory;

import DesignPatterns.FactoryDesignPattern.Factory.Shapes.Circle;
import DesignPatterns.FactoryDesignPattern.Factory.Shapes.Rectangle;
import DesignPatterns.FactoryDesignPattern.Factory.Shapes.Shape;
import DesignPatterns.FactoryDesignPattern.Factory.Shapes.Square;

public class ShapeFactory {

    Shape getShape(String shape) {
        return switch (shape) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
