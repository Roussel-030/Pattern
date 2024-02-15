package com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.brest;

import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class CheesePizzaStyleBrest extends Pizza {
    public CheesePizzaStyleBrest() {
        name = "Pizza sauce style brest and cheese";
        paste = "Paste delicacy";
        sauce = "Sauce marinara";
        garnish.add("garnish brest");
    }
}
