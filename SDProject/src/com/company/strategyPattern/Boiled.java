package com.company.strategyPattern;

public class Boiled implements BoiledStrategy {

    @Override
    public void boil() {
        System.out.println("Варенный");
    }

}
