package com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.strasbourg;

import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class CheesePizzaStyleStrasbourg extends Pizza {
    public CheesePizzaStyleStrasbourg() {
        name = "Pizza sauce style strasbourg and cheese";
        paste = "More pastes";
        sauce = "Sauce with tomato";
        garnish.add("garnish strasbourg");
    }

    @Override
    public void slash() {
        System.out.println("Cutting in square part");
    }
}
