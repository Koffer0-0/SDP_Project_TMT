package com.company.factoryPattern;

public class LatteCoffee implements Drinks {
    @Override
    public void nameOfTheDrink() {
        System.out.println("Кофе \"Латте\"");
    }

    @Override
    public int cost() {
        return 500;
    }
}
