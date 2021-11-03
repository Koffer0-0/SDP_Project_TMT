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
}
