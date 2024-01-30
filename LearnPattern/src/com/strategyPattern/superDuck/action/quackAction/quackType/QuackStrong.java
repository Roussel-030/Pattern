package com.strategyPattern.superDuck.action.quackAction.quackType;

import com.strategyPattern.superDuck.action.quackAction.QuackAction;

public class QuackStrong implements QuackAction {
    @Override
    public void quack() {
        System.out.println("Quack strongly everyday");
    }
}
