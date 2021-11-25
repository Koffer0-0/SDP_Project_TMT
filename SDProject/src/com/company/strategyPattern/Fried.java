package com.company.strategyPattern;

public class Fried implements FriedStrategy {

    @Override
    public void fried() {
        System.out.println("Пожаренный на масле");
    }
}
