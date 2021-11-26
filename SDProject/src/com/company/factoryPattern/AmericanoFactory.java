package com.company.factoryPattern;

public class AmericanoFactory implements DrinksFactory {
    @Override
    public Drinks createDrink() {
        return new AmericanoCoffee();
    }
}
