package com.company.strategyPattern;

public class NoFly implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
