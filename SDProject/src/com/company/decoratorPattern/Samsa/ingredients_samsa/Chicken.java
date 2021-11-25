package com.company.decoratorPattern.Samsa.ingredients_samsa;

import com.company.sueta.Decorator.Samsa.Samsa;
import com.company.sueta.Decorator.Samsa.SamsaDecorator;

public class Chicken extends SamsaDecorator {
    public Chicken(Samsa samsa) {
        super(samsa);
    }

    public String chicken(){
        return ", Курица";
    }

    @Override
    public String food_composition() {
        return super.food_composition() + chicken();
    }
}
