package com.decoratorPattern.starBuzz.concreteComponent;

import com.decoratorPattern.starBuzz.component.Beverage;

public class SwiftSip extends Beverage {

    public SwiftSip(String description) {
        this.description = description;
    }

    @Override
    public double getCost() {
        return 0.99;
    }

}
