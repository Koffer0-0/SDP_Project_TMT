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
}
