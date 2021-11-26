package com.company.strategyPattern;

public class Fried implements FriedStrategy {

    @Override
    public void fry() {
            System.out.println("Пожаренный на масле");
    }
}
