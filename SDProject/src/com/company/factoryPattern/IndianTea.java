package com.company.factoryPattern;

public class IndianTea implements Drinks {
    @Override
    public void nameOfTheDrink() {
        System.out.println("Чай \"Индийский\"");
    }

    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String toString() {
        return "IndianTea{}";
    }
}
