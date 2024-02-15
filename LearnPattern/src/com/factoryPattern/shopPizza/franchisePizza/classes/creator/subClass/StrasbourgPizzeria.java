package com.factoryPattern.shopPizza.franchisePizza.classes.creator.subClass;

import com.factoryPattern.shopPizza.franchisePizza.classes.creator.superClass.Pizzeria;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.strasbourg.CheesePizzaStyleStrasbourg;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.strasbourg.PaprikaPizzaStyleStrasbourg;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.strasbourg.SeaProductPizzaStyleStrasbourg;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.strasbourg.VegetarianPizzaStyleStrasbourg;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class StrasbourgPizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type == "cheese") {
            pizza = new CheesePizzaStyleStrasbourg();
        } else if(type == "paprika") {
            pizza = new PaprikaPizzaStyleStrasbourg();
        } else if(type == "sea product") {
            pizza = new SeaProductPizzaStyleStrasbourg();
        } else if(type == "vegetarian") {
            pizza = new VegetarianPizzaStyleStrasbourg();
        }

        return pizza;
    }
}
