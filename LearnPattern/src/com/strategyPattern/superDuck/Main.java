package com.strategyPattern.superDuck;

import com.strategyPattern.superDuck.subClass.Mallard;
import com.strategyPattern.superDuck.superClass.Duck;

public class Main {
    public static void main(String args[]) {
        Duck duck = new Mallard();
        duck.makeFly();
        duck.makeQuack();
    }
}
