package com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.brest;

import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class PaprikaPizzaStyleBrest extends Pizza {
    public PaprikaPizzaStyleBrest() {
        name = "Pizza sauce style brest and paprika";
        paste = "Paste delicacy";
        sauce = "Sauce marinara";
        garnish.add("garnish brest");
    }
}
