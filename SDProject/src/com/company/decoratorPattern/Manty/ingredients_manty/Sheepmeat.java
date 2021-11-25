package com.company.decoratorPattern.Manty.ingredients_manty;

import com.company.sueta.Decorator.Manty.Manty;
import com.company.sueta.Decorator.Manty.MantyDecorator;

public class Sheepmeat extends MantyDecorator {
    public Sheepmeat(Manty manty) {
        super(manty);
    }

    public String sheepmeat(){
        return ", Баранина ";
    }

    @Override
    public String food_composition() {
        return super.food_composition() + sheepmeat();
    }
}
