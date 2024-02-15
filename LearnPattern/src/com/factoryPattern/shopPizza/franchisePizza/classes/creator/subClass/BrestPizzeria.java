package com.factoryPattern.shopPizza.franchisePizza.classes.creator.subClass;

import com.factoryPattern.shopPizza.franchisePizza.classes.creator.superClass.Pizzeria;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.brest.CheesePizzaStyleBrest;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.brest.PaprikaPizzaStyleBrest;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.brest.SeaProductPizzaStyleBrest;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.subClass.brest.VegetarianPizzaStyleBrest;
import com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass.Pizza;

public class BrestPizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type == "cheese") {
            pizza = new CheesePizzaStyleBrest();
        } else if(type == "paprika") {
            pizza = new PaprikaPizzaStyleBrest();
        } else if(type == "sea product") {
            pizza = new SeaProductPizzaStyleBrest();
        } else if(type == "vegetarian") {
            pizza = new VegetarianPizzaStyleBrest();
        }

        return pizza;
    }

}
