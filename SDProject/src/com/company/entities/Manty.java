package com.company.entities;

import com.company.strategyPattern.*;

public class Manty extends Dishes {

    public Manty() {
        super(new NotBoiled(), new Fried(), new Steamed(), new NotBaked());
    }

    @Override
    public void display() {
        System.out.println("Манты");
    }

    @Override
    public int cost() {
        return 300;
    }

    @Override
    public void takeSize() {

    }

    @Override
    public String toString() {
        return "Manty{";
    }
}
