package com.company.entities;

import com.company.strategyPattern.*;

public class Goulash extends Dishes {

    public Goulash() {
        super(new Boiled(), new NotFried(), new NotSteamed(), new NotBaked());
    }

    @Override
    public void display() {
        System.out.println("Гуляш");
    }

    @Override
    public double cost() {
        return 450;
    }

    @Override
    public void takeSize() {

    }
}
