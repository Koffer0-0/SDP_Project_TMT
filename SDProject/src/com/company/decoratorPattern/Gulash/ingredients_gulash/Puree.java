package com.company.decoratorPattern.Gulash.ingredients_gulash;

import com.company.sueta.Decorator.Gulash.Gulash;
import com.company.sueta.Decorator.Gulash.GulashDecorator;

public class Puree extends GulashDecorator {
    public Puree(Gulash gulash) {
        super(gulash);
    }

    public String puree(){
        return ", Пюре";
    }

    @Override
    public String food_composition() {
        return super.food_composition() + puree();
    }
}
