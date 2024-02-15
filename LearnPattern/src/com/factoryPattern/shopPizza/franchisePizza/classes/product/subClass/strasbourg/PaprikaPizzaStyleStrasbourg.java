package com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.strasbourg;

import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class PaprikaPizzaStyleStrasbourg extends Pizza {
    public PaprikaPizzaStyleStrasbourg() {
        name = "Pizza sauce style strasbourg and paprika";
        paste = "More pastes";
        sauce = "Sauce with tomato";
        garnish.add("garnish strasbourg");
    }
}
