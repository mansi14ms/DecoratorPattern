package com.patterns.Base;

public class MargharitaPizzaImpl implements Pizza{
    @Override
    public void serve() {
        System.out.println("Serving Margarita Pizza");
    }

    @Override
    public int cost() {
        return 108;
    }
}
