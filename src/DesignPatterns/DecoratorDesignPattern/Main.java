package DesignPatterns.DecoratorDesignPattern;

import DesignPatterns.DecoratorDesignPattern.Base.BasePizza;
import DesignPatterns.DecoratorDesignPattern.Base.Margarita;
import DesignPatterns.DecoratorDesignPattern.Toppings.ExtraCheese;
import DesignPatterns.DecoratorDesignPattern.Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza margaritaPizzaWithExtraCheeseAndMushroom = new Mushroom(new ExtraCheese(new Margarita()));

        System.out.println(margaritaPizzaWithExtraCheeseAndMushroom.cost());
    }
}
