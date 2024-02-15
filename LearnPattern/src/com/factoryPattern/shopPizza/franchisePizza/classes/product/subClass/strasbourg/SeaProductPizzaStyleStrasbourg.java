package com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.strasbourg;

import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class SeaProductPizzaStyleStrasbourg extends Pizza {
    public SeaProductPizzaStyleStrasbourg() {
        name = "Pizza sauce style strasbourg and sea product";
        paste = "More pastes";
        sauce = "Sauce with tomato";
        garnish.add("garnish strasbourg");
    }
}
