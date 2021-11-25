package com.company.strategyPattern;

public class Baked implements BakedStrategy {

    @Override
    public void bake() {
        System.out.println("Запекли в духовке");
    }
}
