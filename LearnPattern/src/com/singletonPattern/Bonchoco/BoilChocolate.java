package com.singletonPattern.Bonchoco;

public class BoilChocolate {

    private boolean empty;
    private boolean boiled;
    private static BoilChocolate boilChocolate;

    private BoilChocolate() {
        empty = true;
        boiled = false;
    }

    public static BoilChocolate getInstance() {
        if(boilChocolate == null) {
            boilChocolate = new BoilChocolate();
        }
        return boilChocolate;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void cook() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    //Getters
    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
