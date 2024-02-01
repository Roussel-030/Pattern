package com.decoratorPattern.starBuzz.component;

public abstract class Beverage {

    protected String description;

    //Abstract method
    public abstract double getCost();

    //Getter
    public String getDescription() {
        return description;
    }

}
