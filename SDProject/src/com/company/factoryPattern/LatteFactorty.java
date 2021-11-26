package com.company.factoryPattern;

public class LatteFactorty implements DrinksFactory {
    @Override
    public Drinks createDrink() {
        return new LatteCoffee();
    }
}
