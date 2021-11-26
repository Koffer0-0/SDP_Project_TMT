package com.company.bridgePattern;

public class Medium implements Size {

    @Override
    public void takeSize() {
        System.out.println("Средняя порция");
    }

    @Override
    public int cost() {
        return 150;
    }
}
