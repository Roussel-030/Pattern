package com.factoryPattern.shopPizza.simplePizza.classes.builder;

import com.factoryPattern.shopPizza.simplePizza.classes.subClass.CheesePizza;
import com.factoryPattern.shopPizza.simplePizza.classes.subClass.PepperPizza;
import com.factoryPattern.shopPizza.simplePizza.classes.superClass.Pizza;

public class PizzaBuilder {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type == "cheese") {
            pizza = new CheesePizza();
        } else if(type == "pepper") {
            pizza = new PepperPizza();
        }

        return pizza;
    }
}
