package com.strategyPattern.superDuck.action.flyAction.flyType;

import com.strategyPattern.superDuck.action.flyAction.FlyAction;

public class FlyNever implements FlyAction {
    @Override
    public void fly() {
        System.out.println("Don't never fly");
    }
}
