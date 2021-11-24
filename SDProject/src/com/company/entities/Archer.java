package com.company.entities;

import com.company.strategyPattern.*;

public class Archer extends Infantry {

    public Archer() {
        super(new NoFly(), new NoJump());
    }

    @Override
    public void display() {
        System.out.println("ARCHERS");
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
