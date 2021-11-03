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
}
