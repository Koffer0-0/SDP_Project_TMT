package com.company.strategyPattern;

public class NoJump implements JumpStrategy {

    @Override
    public void jump() {
        System.out.println("Can not jump");
    }
}
