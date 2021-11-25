package com.company.decoratorPattern.Manty;

public class MantyDecorator implements Manty{
    Manty manty;

    public MantyDecorator(Manty manty) {
        this.manty = manty;
    }

    @Override
    public String food_composition() {
        return manty.food_composition();
    }
}
