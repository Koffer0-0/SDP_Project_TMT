package com.company.factoryPattern;

public class UzbekTeaFactory implements DrinksFactory {
    @Override
    public Drinks createDrink() {
        return new UzbekTea();
    }
}
