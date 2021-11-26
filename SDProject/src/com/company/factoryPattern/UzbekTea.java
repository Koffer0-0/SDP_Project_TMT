package com.company.factoryPattern;

public class UzbekTea implements Drinks {
    @Override
    public void nameOfTheDrink() {
        System.out.println("Чай \"Узбекский\"");
    }

    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String toString() {
        return "UzbekTea{}";
    }
}
