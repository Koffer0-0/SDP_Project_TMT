package com.company.decoratorPattern.Gulash.ingredients_gulash;

import com.company.sueta.Decorator.Gulash.Gulash;
import com.company.sueta.Decorator.Gulash.GulashDecorator;

public class Buckwheat extends GulashDecorator {
    public Buckwheat(Gulash gulash) {
        super(gulash);
    }

    public String buckwheat(){
        return ", Гречка";
    }

    @Override
    public String food_composition() {
        return super.food_composition() + buckwheat();
    }
}
