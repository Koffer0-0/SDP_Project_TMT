package com.company.decoratorPattern.Gulash.ingredients_gulash;

import com.company.sueta.Decorator.Gulash.Gulash;

public class Rice implements Gulash{
    @Override
    public String food_composition() {
        return "Гуляш с : Рис ";
    }
}
