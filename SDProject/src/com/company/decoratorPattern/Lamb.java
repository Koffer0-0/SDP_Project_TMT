package com.company.decoratorPattern;

import com.company.entities.Dishes;

public class Lamb extends Topping {

    Dishes dishes;

    public Lamb(Dishes dishes) {
        this.dishes = dishes;
    }

    @Override
    public void display() {
        System.out.println("Ягнятина");
    }

    @Override
    public int cost() {
        return 450;
    }

    @Override
    public void takeSize() {

    }
}
