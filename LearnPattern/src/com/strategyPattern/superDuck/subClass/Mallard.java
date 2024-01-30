package com.strategyPattern.superDuck.subClass;

import com.strategyPattern.superDuck.action.flyAction.flyType.FlyWithWing;
import com.strategyPattern.superDuck.action.quackAction.quackType.QuackStrong;
import com.strategyPattern.superDuck.superClass.Duck;

public class Mallard extends Duck {

    //Constructor
    public Mallard() {
        flyAction = new FlyWithWing();
        quackAction = new QuackStrong();
    }

    @Override
    public void show() {
        System.out.println("I'm a duck of kind :mallard");
    }
}
