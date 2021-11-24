package com.company.entities;

import com.company.strategyPattern.*;

public class Barbarian extends Infantry {

    public Barbarian() {
        super(new NoFly(), new NoJump());
    }

    @Override
    public void display() {
        System.out.println("UUURGAAH");
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void trainTroop() {

    }

    @Override
    public void improveTroop() {

    }
}
