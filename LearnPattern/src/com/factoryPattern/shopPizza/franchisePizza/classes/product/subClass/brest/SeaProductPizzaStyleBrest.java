package com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.brest;

import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class SeaProductPizzaStyleBrest extends Pizza {
    public SeaProductPizzaStyleBrest() {
        name = "Pizza sauce style brest and sea product";
        paste = "Paste delicacy";
        sauce = "Sauce marinara";
        garnish.add("garnish brest");
    }
}
