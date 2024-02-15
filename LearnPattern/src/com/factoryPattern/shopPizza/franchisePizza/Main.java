package com.factoryPattern.shopPizza.franchisePizza;

import com.factoryPattern.shopPizza.franchisePizza.classes.creator.subClass.StrasbourgPizzeria;
import com.factoryPattern.shopPizza.franchisePizza.classes.creator.superClass.Pizzeria;

public class Main {
    public static void main(String args[]) {
        Pizzeria pizzeria = new StrasbourgPizzeria();
        pizzeria.commandPizza("vegetarian");
    }
}
