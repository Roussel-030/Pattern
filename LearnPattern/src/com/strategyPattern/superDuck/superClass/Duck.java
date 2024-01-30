package com.strategyPattern.superDuck.superClass;

import com.strategyPattern.superDuck.action.flyAction.FlyAction;
import com.strategyPattern.superDuck.action.quackAction.QuackAction;

public abstract class Duck {

    protected FlyAction flyAction;
    protected QuackAction quackAction;

    //Methods
    public void makeFly() {
        flyAction.fly();
    }
    public void makeQuack() {
        quackAction.quack();
    }

    public void swim() {
        System.out.println("Swim in water");
    }
    abstract public void show();
}
