package com.strategyPattern.superDuck.subClass;

import com.strategyPattern.superDuck.superClass.Duck;

public class Mandarin extends Duck {
    @Override
    public void show() {
        System.out.println("I'm a duck of kind :mandarin");
    }
}
