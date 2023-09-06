package com.myClass;

import com.myClass.superClass.Duck;

public class Mallard extends Duck {
    @Override
    public void show() {
        System.out.println("I'm a duck of kind :mallard");
    }
}
