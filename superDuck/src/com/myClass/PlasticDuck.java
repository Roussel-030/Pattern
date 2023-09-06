package com.myClass;

import com.myClass.superClass.Duck;

public class PlasticDuck extends Duck {
    @Override
    public void show() {
        System.out.println("I'm a duck of kind :plastic duck");
    }
    public void quack() {
        System.out.println("Do: ki ki ki ki ki ki ki ki ki ki");
    }
}
