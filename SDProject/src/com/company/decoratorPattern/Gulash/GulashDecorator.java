package com.company.decoratorPattern.Gulash;

public class GulashDecorator implements Gulash {
    Gulash gulash;

    public GulashDecorator(Gulash gulash) {
        this.gulash = gulash;
    }

    @Override
    public String food_composition() {
        return gulash.food_composition();
    }
}
