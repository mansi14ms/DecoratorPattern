package com.patterns;

import com.patterns.Base.BarbecueChickenPizzaImpl;
import com.patterns.Base.FreshPanPizzaImpl;
import com.patterns.Base.Pizza;
import com.patterns.Decorator.ExtraCheeseTopping;
import com.patterns.Decorator.VegesToppings;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pizza pizza = new FreshPanPizzaImpl();
        pizza = new VegesToppings(new ExtraCheeseTopping(pizza));
        pizza.serve();
        System.out.println("pizza cost : " + pizza.cost());

        Pizza pizza1 = new BarbecueChickenPizzaImpl();
        pizza1 = new ExtraCheeseTopping(pizza1);
        pizza1.serve();
        System.out.println("pizza cost : " + pizza1.cost());
    }
}
