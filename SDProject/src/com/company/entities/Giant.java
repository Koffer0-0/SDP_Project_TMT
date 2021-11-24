package com.company.entities;

import com.company.strategyPattern.*;

public class Giant extends Infantry {

    public Giant() {
        super(new NoFly(), new NoJump());
    }

    @Override
    public void display() {
        System.out.println("CRUSH CRUSH CRUSH");
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
