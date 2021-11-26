package com.company.entities;

import com.company.strategyPattern.*;

public class Samsa extends Dishes {

    public Samsa() {
        super(new NotBoiled(), new NotFried(), new NotSteamed(), new Baked());
    }

    @Override
    public void display() {
        System.out.println("Самса");
    }

    @Override
    public int cost() {
        return 200;
    }

    @Override
    public void takeSize() {

    }

    @Override
    public String toString() {
        return "Samsa{}";
    }
}
