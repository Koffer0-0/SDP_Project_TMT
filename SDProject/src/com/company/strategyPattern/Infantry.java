package com.company.strategyPattern;

public abstract class Infantry {

    private String description = "UNKNOWN";
    protected String purpose;

    private FlyStrategy flyStrategy;
    private JumpStrategy jumpStrategy;

    public Infantry() {}

    public Infantry(String purpose) {
        this.purpose = purpose;
    }

    protected abstract void display();

    //STRATEGY
    /* <----------------------------------------------------------------------------------------------> */
    public Infantry(FlyStrategy flyStrategy, JumpStrategy jumpStrategy) {
        this.flyStrategy = flyStrategy;
        this.jumpStrategy = jumpStrategy;
    }

    public void performJump() {
        this.jumpStrategy.jump();
    }

    public void performFly() {
        this.flyStrategy.fly();
    }

    public FlyStrategy getFlyStrategy() {
        return flyStrategy;
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public JumpStrategy getJumpStrategy() {
        return jumpStrategy;
    }

    public void setJumpStrategy(JumpStrategy jumpStrategy) {
        this.jumpStrategy = jumpStrategy;
    }

    //DECORATOR
    /* <----------------------------------------------------------------------------------------------> */

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    //BRIDGE
    /* <----------------------------------------------------------------------------------------------> */

    public abstract void traintroop();
    public abstract void improveTroop();

}
