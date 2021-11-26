package com.company.decoratorPattern;

import com.company.entities.Dishes;

public class Chicken extends Topping {

    Dishes dishes;

    public Chicken(Dishes dishes) {
        this.dishes = dishes;
    }

    @Override
    protected void display() {

    }

    @Override
    public double cost() {
        return 70;
    }

    @Override
    public void takeSize() {

    }
}
