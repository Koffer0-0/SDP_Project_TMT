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
}
