package com.company.decoratorPattern.Manty.ingredients_manty;

import com.company.sueta.Decorator.Manty.Manty;
import com.company.sueta.Decorator.Manty.MantyDecorator;

public class Beef extends MantyDecorator {
    public Beef(Manty manty) {
        super(manty);
    }

    public String beef(){
        return ", Говядина ";
    }

    @Override
    public String food_composition() {
        return super.food_composition() + beef();
    }
}
