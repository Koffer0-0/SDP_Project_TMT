package com.company.strategyPattern;

public class Steamed implements SteamedStrategy {

    @Override
    public void steam() {
        System.out.println("Приготовлен на пару");
    }
}
