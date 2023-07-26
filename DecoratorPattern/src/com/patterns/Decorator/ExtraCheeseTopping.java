package com.patterns.Decorator;

import com.patterns.Base.Pizza;

public class ExtraCheeseTopping extends AbstractToppings {
    public ExtraCheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void serve() {
        System.out.println("Added cheese");
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 37;
    }
}
