package com.company.decoratorPattern;

import com.company.entities.Dishes;

public class Lamb extends Topping {

    Dishes dishes;

    public Lamb(Dishes dishes) {
        this.dishes = dishes;
    }

    @Override
    protected void display() {

    }

    @Override
    public double cost() {
        return 90;
    }

    @Override
    public void takeSize() {

    }
}
