package com.company.entities;

import com.company.strategyPattern.*;

public class Dragon extends Infantry {

    public Dragon() {
        super(new Fly(), new NoJump());
    }

    @Override
    public void display() {
        System.out.println("ARRRRRRRR DRAGON PSH PSH PSH");
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
