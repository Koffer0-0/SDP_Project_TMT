package com.company.decoratorPattern;

import com.company.entities.Dishes;

public class Beef extends Topping {

    Dishes dishes;

    public Beef(Dishes dishes) {
        this.dishes = dishes;
    }

    @Override
    public void display() {
        System.out.println("Говядина");
    }

    @Override
    public int cost() {
        return 600;
    }

    @Override
    public void takeSize() {

    }

    @Override
    public String toString() {
        return "Beef{" +
                "dishes=" + dishes +
                '}';
    }
}
