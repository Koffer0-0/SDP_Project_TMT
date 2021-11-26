package com.company.decoratorPattern;

import com.company.entities.Dishes;

public class Cheese extends Topping {

    Dishes dishes;

    public Cheese(Dishes dishes) {
        this.dishes = dishes;
    }

    @Override
    public void display() {
        System.out.println("Сыр");
    }

    @Override
    public int cost() {
        return 50;
    }

    @Override
    public void takeSize() {

    }
}
