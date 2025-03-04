package com.decoratorPattern.starBuzz.decoratorConcrete;

import com.decoratorPattern.starBuzz.component.Beverage;
import com.decoratorPattern.starBuzz.decorator.Ingredient;

public class Chocolate extends Ingredient {
    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 0.20 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", "+"Chocolate";
    }

}
