package com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.strasbourg;

import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class VegetarianPizzaStyleStrasbourg extends Pizza {
    public VegetarianPizzaStyleStrasbourg() {
        name = "Pizza sauce style strasbourg and vegetarian";
        paste = "More pastes";
        sauce = "Sauce with tomato";
        garnish.add("garnish strasbourg");
    }
}
