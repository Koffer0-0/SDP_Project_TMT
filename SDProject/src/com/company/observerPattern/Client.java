package com.company.observerPattern;

import java.util.List;

public class Client implements Observer {

    private String name;
    public Client(String name) {
        this.name = name;
    }

    @Override
    public void add(List<String> order) {
        System.out.println("Здраствуйте " + this.name + " , " + "Ваш заказ " + order + " готов!\n");
    }
}
