package com.decoratorPattern.starBuzz.decoratorConcrete;

import com.decoratorPattern.starBuzz.component.Beverage;
import com.decoratorPattern.starBuzz.decorator.Ingredient;

public class Chantilly extends Ingredient {

    private Beverage beverage;

    public Chantilly(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 0.10 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", "+"Chantilly";
    }

}
