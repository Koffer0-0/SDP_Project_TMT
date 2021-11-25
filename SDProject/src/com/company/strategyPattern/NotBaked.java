package com.company.strategyPattern;

public class NotBaked implements BakedStrategy {

    @Override
    public void bake() {
        System.out.println("Не печенный");
    }
}
