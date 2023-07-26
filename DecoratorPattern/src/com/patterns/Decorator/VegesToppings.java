package com.patterns.Decorator;

import com.patterns.Base.Pizza;

public class VegesToppings extends AbstractToppings {

    public VegesToppings(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void serve() {
        System.out.println("Added vegess");
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }
}
