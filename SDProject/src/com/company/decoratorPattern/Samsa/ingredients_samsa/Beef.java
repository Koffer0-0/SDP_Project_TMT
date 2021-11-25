package com.company.decoratorPattern.Samsa.ingredients_samsa;

import com.company.sueta.Decorator.Samsa.Samsa;
import com.company.sueta.Decorator.Samsa.SamsaDecorator;

public class Beef extends SamsaDecorator {
    public Beef(Samsa samsa) {
        super(samsa);
    }

    public String beef(){
        return ", Говядина";
    }

    @Override
    public String food_composition() {
        return super.food_composition() + beef();
    }
}
