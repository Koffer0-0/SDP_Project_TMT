package com.company;

import com.company.facadePattern.ServiceFacade;

public class Main {
    public static void main(String[] args) {
        ServiceFacade sf = new ServiceFacade();
        sf.serveClient();
    }
}
