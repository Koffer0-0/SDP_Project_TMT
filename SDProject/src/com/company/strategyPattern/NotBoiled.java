package com.company.strategyPattern;

public class NotBoiled implements BoiledStrategy {

    @Override
    public void boil() {
        System.out.println("Не варенный");
    }
}
