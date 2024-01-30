package com.strategyPattern.superDuck.action.flyAction.flyType;

import com.strategyPattern.superDuck.action.flyAction.FlyAction;

public class FlyWithWing implements FlyAction {
    @Override
    public void fly() {
        System.out.println("Fly with wing");
    }
}
