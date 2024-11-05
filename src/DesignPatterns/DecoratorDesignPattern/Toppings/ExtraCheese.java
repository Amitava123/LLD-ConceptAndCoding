package DesignPatterns.DecoratorDesignPattern.Toppings;

import DesignPatterns.DecoratorDesignPattern.Base.BasePizza;

public class ExtraCheese extends BaseToppings{
    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 15;
    }
}
