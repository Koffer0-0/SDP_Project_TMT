package com.company.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Stolovka implements Observable {

    private List<Observer> clients = new ArrayList<>();
    private List<String> promotions = new ArrayList<>();

    public void addOrder(String order) {
        this.promotions.add(order);
        notifyAllClients();
    }

    public void removeOrder(String order) {
        this.promotions.remove(order);
        notifyAllClients();
    }

    @Override
    public void notifyAllClients() {
        this.promotions = promotions;
        for (Observer heroes : this.clients) {
            heroes.add(this.promotions);
        }
    }

    @Override
    public void addClient(Observer client) {
        this.clients.add(client);
        System.out.println("Ваш Заказ принят, ожидайте!");
    }

    @Override
    public void removeClient(Observer client) {
        this.clients.remove(client);
    }

}
