package com.company.decoratorPattern.Samsa.ingredients_samsa;

import com.company.sueta.Decorator.Samsa.Samsa;

public class Potato implements Samsa {
    @Override
    public String food_composition() {
        return "Самса с : Картошка";
    }
}
