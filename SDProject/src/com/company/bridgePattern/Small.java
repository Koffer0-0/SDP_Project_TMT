package com.company.bridgePattern;

public class Small implements Size {

    @Override
    public void takeSize() {
        System.out.println("Маленькая порция");
    }

    @Override
    public int cost() {
        return 100;
    }
}
