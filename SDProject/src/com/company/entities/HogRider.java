package com.company.entities;

import com.company.strategyPattern.*;

public class HogRider extends Infantry {

    public HogRider() {
        super(new NoFly(), new Jump());
    }

    @Override
    public void display() {
        System.out.println("HOOOOG RIDER");
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void traintroop() {

    }

    @Override
    public void improveTroop() {

    }

}
