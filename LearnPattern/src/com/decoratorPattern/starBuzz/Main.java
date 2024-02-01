package com.decoratorPattern.starBuzz;

import com.decoratorPattern.starBuzz.component.Beverage;
import com.decoratorPattern.starBuzz.concreteComponent.Colombian;
import com.decoratorPattern.starBuzz.decoratorConcrete.Chantilly;
import com.decoratorPattern.starBuzz.decoratorConcrete.Chocolate;

public class Main {
    public static void main(String args[]) {
        Beverage beverage = new Colombian("My beverage colombian");
        System.out.println(beverage.getDescription()+", cost: "+beverage.getCost()+" $.");

        beverage = new Chocolate(beverage);
        System.out.println(beverage.getDescription()+", cost: "+beverage.getCost()+" $.");

        beverage = new Chantilly(beverage);
        System.out.println(beverage.getDescription()+", cost: "+beverage.getCost()+" $.");
    }
}
