package com.strategyPattern.superDuck.action.quackAction.quackType;

import com.strategyPattern.superDuck.action.quackAction.QuackAction;

public class QuackNever implements QuackAction {
    @Override
    public void quack() {
        System.out.println("Nothing");
    }
}
