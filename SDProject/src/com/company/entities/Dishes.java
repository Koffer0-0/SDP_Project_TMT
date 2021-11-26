package com.company.entities;

import com.company.strategyPattern.BakedStrategy;
import com.company.strategyPattern.BoiledStrategy;
import com.company.strategyPattern.FriedStrategy;
import com.company.strategyPattern.SteamedStrategy;

public abstract class Dishes {
    protected String purpose;

    private BoiledStrategy boiledStrategy;
    private FriedStrategy friedStrategy;
    private SteamedStrategy steamedStrategy;
    private BakedStrategy bakedStrategy;

    public Dishes() {}

    public Dishes(String purpose) {
        this.purpose = purpose;
    }

    public abstract void display();

    //STRATEGY
    /* <----------------------------------------------------------------------------------------------> */
    public Dishes(BoiledStrategy boiledStrategy, FriedStrategy friedStrategy, SteamedStrategy steamedStrategy,BakedStrategy bakedStrategy) {
        this.boiledStrategy = boiledStrategy;
        this.friedStrategy = friedStrategy;
        this.steamedStrategy = steamedStrategy;
        this.bakedStrategy = bakedStrategy;
    }

    public void performFry() {
        this.friedStrategy.fry();
    }

    public void performBoil() {
        this.boiledStrategy.boil();
    }

    public void performSteam() {
        this.steamedStrategy.steam();
    }


    public BoiledStrategy getBoilStrategy() {
        return boiledStrategy;
    }

    public void setBoilStrategy(BoiledStrategy boiledStrategy) {
        this.boiledStrategy = boiledStrategy;
    }

    public FriedStrategy getFryStrategy() {
        return friedStrategy;
    }

    public void setFryStrategy(FriedStrategy friedStrategy) {
        this.friedStrategy = friedStrategy;
    }

    public SteamedStrategy getSteamStrategy() {
        return steamedStrategy;
    }

    public void setSteamStrategy(SteamedStrategy steamedStrategy) {
        this.steamedStrategy = steamedStrategy;
    }

    public BakedStrategy getBakedStrategy() {
        return bakedStrategy;
    }

    public void setBakedStrategy(BakedStrategy bakedStrategy) {
        this.bakedStrategy = bakedStrategy;
    }

//DECORATOR
    /* <----------------------------------------------------------------------------------------------> */

    public abstract int cost();

    //BRIDGE
    /* <----------------------------------------------------------------------------------------------> */

    public abstract void takeSize();

}
