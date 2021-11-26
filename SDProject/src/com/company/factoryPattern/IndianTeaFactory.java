package com.company.factoryPattern;

public class IndianTeaFactory implements DrinksFactory {
    @Override
    public Drinks createDrink() {
        return new IndianTea();
    }
}
