package com.company.entities;

import com.company.strategyPattern.*;

public class Wizzard extends Infantry {

    public Wizzard() {
        super(new NoFly(), new NoJump());
    }

    @Override
    public void display() {
        System.out.println("MAGIC");
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
