package com.patterns.Base;

public class BarbecueChickenPizzaImpl implements Pizza{
    @Override
    public void serve() {
        System.out.println("Serving Barbecue Pizza");
    }

    @Override
    public int cost() {
        return 100;
    }
}
