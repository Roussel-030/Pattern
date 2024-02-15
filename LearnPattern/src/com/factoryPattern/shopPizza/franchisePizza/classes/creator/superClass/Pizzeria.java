package com.factoryPattern.shopPizza.franchisePizza.classes.creator.superClass;

import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public abstract class Pizzeria {

    public Pizza commandPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.cook();
        pizza.prepare();
        pizza.slash();
        pizza.pack();

        return pizza;
    }

    abstract public Pizza createPizza(String type);

}
