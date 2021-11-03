package com.company.strategyPattern;

public class Fly implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Can fly");
    }

}
