package com.company.bridgePattern;

public class Large implements Size {

    @Override
    public void takeSize() {
        System.out.println("Большая порция");
    }
}
