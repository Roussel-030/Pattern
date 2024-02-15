package com.factoryPattern.shopPizza.franchisePizza.classes.product.superClass;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String paste;
    protected String sauce;
    protected ArrayList garnish = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparation of "+name);
        System.out.println("Exhibited the paste");
        System.out.println("Add the sauce");
        System.out.println("Add the garnish");
        for(int i = 0; i < garnish.size(); i++) {
            System.out.println(" " + garnish.get(i));
        }
    }
    public void cook() {
        System.out.println("Cooking: 25 minutes to 180°");
    }
    public void slash() {
        System.out.println("Cutting in triangular part");
    }
    public void pack() {
        System.out.println("Packaging in box");
    }

    //Getter
    public String getName() {
        return name;
    }

}
