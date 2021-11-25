package com.company.strategyPattern;

public class NotSteamed implements SteamedStrategy {

    @Override
    public void steam() {
        System.out.println("Не приготовлен на пару");
    }
}
