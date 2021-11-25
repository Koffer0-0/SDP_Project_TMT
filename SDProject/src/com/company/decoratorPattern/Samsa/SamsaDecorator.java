package com.company.decoratorPattern.Samsa;

public class SamsaDecorator implements Samsa{
    Samsa samsa;

    public SamsaDecorator(Samsa samsa) {
        this.samsa = samsa;
    }

    @Override
    public String food_composition() {
        return samsa.food_composition();
    }
}
