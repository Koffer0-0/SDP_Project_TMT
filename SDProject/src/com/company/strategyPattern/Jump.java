package com.company.strategyPattern;

public class Jump implements JumpStrategy {

    @Override
    public void jump() {
        System.out.println("Can not jump");
    }
}
