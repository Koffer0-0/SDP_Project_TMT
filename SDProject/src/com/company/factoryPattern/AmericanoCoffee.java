package com.company.factoryPattern;

public class AmericanoCoffee implements Drinks {
    @Override
    public void nameOfTheDrink() {
        System.out.println("Кофе \"Американо\"");
    }

    @Override
    public int cost() {
        return 300;
    }
}
