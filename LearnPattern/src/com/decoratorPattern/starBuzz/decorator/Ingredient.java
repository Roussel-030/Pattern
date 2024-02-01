package com.decoratorPattern.starBuzz.decorator;

import com.decoratorPattern.starBuzz.component.Beverage;

public abstract class Ingredient extends Beverage {
    public abstract String getDescription();
}
