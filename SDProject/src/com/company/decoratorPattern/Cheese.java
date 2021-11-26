package com.company.decoratorPattern;

import com.company.entities.Dishes;

public class Cheese extends Topping {

    Dishes dishes;

    public Cheese(Dishes dishes) {
        this.dishes = dishes;
    }

    @Override
    protected void display() {

    }

    @Override
    public double cost() {
        return 50;
    }

    @Override
    public void takeSize() {

    }
}
