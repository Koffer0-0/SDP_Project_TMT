package com.company.strategyPattern;

public class NotFried implements FriedStrategy {

    @Override
    public void fry() {
        System.out.println("Не жаренный");
    }
}
