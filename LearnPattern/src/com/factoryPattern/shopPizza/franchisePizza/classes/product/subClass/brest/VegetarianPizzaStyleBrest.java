package com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.brest;

import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class VegetarianPizzaStyleBrest extends Pizza {
    public VegetarianPizzaStyleBrest() {
        name = "Pizza sauce style brest and vegetarian";
        paste = "Paste delicacy";
        sauce = "Sauce marinara";
        garnish.add("garnish brest");
    }
}
