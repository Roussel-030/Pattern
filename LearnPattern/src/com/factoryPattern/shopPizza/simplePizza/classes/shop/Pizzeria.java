package com.factoryPattern.shopPizza.simplePizza.classes.shop;

import com.factoryPattern.shopPizza.simplePizza.classes.builder.PizzaBuilder;
import com.factoryPattern.shopPizza.simplePizza.classes.superClass.Pizza;

public class Pizzeria {

    private PizzaBuilder pizzaBuilder;

    //Constructor with parameter
    public Pizzeria(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    Pizza commandPizza(String type) {
        Pizza pizza = null;

        pizza = pizzaBuilder.createPizza("cheese");

        pizza.cook();
        pizza.prepare();
        pizza.slash();
        pizza.pack();

        return pizza;
    }

}
