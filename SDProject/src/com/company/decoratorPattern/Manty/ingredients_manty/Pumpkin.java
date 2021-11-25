package com.company.decoratorPattern.Manty.ingredients_manty;

import com.company.sueta.Decorator.Manty.Manty;
import com.company.sueta.Decorator.Manty.MantyDecorator;

public class Pumpkin extends MantyDecorator {
    public Pumpkin(Manty manty) {
        super(manty);
    }

    public String pumpkin(){
        return ", Тыква ";
    }

    @Override
    public String food_composition() {
        return super.food_composition() + pumpkin();
    }
}
