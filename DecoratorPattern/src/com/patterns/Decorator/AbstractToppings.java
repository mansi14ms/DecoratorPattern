package com.patterns.Decorator;

import com.patterns.Base.Pizza;

public abstract class AbstractToppings implements Pizza {
    public Pizza pizza;

    public AbstractToppings(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void serve() {
        pizza.serve();

    }
}
