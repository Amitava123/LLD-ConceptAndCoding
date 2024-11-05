package DesignPatterns.DecoratorDesignPattern.Toppings;

import DesignPatterns.DecoratorDesignPattern.Base.BasePizza;

public class Mushroom extends BaseToppings {
    BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
