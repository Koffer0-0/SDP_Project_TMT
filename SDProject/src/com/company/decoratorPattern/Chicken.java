package com.company.decoratorPattern;

import com.company.entities.Dishes;

public class Chicken extends Topping {

    Dishes dishes;

    public Chicken(Dishes dishes) {
        this.dishes = dishes;
    }

    @Override
    public void display() {
        System.out.println("Курица");
    }

    @Override
    public int cost() {
        return 350;
    }

    @Override
    public void takeSize() {

    }

    @Override
    public String toString() {
        return "Chicken{" +
                "dishes=" + dishes +
                '}';
    }
}
