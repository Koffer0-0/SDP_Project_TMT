package com.company;

import com.company.bridgePattern.Large;
import com.company.bridgePattern.Medium;
import com.company.bridgePattern.Size;
import com.company.bridgePattern.Small;
import com.company.decoratorPattern.Beef;
import com.company.decoratorPattern.Chicken;
import com.company.decoratorPattern.Lamb;
import com.company.entities.Dishes;
import com.company.entities.Goulash;
import com.company.entities.Manty;
import com.company.entities.Samsa;
import com.company.facadePattern.ServiceFacade;
import com.company.factoryPattern.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceFacade sf = new ServiceFacade();
        sf.serveClient();
    }
}
