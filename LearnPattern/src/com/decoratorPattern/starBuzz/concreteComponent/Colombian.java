package com.decoratorPattern.starBuzz.concreteComponent;

import com.decoratorPattern.starBuzz.component.Beverage;

public class Colombian extends Beverage {

    public Colombian(String description) {
        this.description = description;
    }

    @Override
    public double getCost() {
        return 1.99;
    }

}
