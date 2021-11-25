package com.company.observerPattern;

public interface Observable {

    void notifyAllClients();
    void addClient(Observer client);
    void removeClient(Observer client);

}
