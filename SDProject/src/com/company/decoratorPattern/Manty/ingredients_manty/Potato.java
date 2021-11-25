package com.company.decoratorPattern.Manty.ingredients_manty;

import com.company.sueta.Decorator.Manty.Manty;


public class Potato implements Manty {
    @Override
    public String food_composition() {
        return "Манты с : Картошка ";
    }
}
