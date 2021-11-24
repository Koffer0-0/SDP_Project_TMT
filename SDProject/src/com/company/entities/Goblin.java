package com.company.entities;

import com.company.strategyPattern.*;

public class Goblin extends Infantry {

    public Goblin() {
        super(new NoFly(), new NoJump());
    }

    @Override
    public void display() {
        System.out.println("HE HE (*sounds of fallen coin");
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
