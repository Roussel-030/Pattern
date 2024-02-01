package com.decoratorPattern.starBuzz.decoratorConcrete;

import com.decoratorPattern.starBuzz.component.Beverage;
import com.decoratorPattern.starBuzz.decorator.Ingredient;

public class Caramel extends Ingredient {

    private Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 0.15 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", "+"Caramel";
    }

}
