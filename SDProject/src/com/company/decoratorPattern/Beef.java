package com.company.decoratorPattern;

import com.company.entities.Dishes;

public class Beef extends Topping {

    Dishes dishes;

    public Beef(Dishes dishes) {
        this.dishes = dishes;
    }

    @Override
    protected void display() {

    }

    @Override
    public double cost() {
        return 100;
    }

    @Override
    public void takeSize() {

    }
}
