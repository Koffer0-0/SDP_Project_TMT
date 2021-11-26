package com.company.facadePattern;

import com.company.bridgePattern.Size;
import com.company.entities.Dishes;
import com.company.entities.Waiter;
import com.company.factoryPattern.Drinks;
import com.company.factoryPattern.DrinksFactory;
import com.company.observerPattern.Stolovka;

import java.util.Scanner;

public class ServiceFacade {
    private Waiter waiter = new Waiter();
    private Stolovka stolovka = new Stolovka();

    Scanner input = new Scanner(System.in);

    Dishes dishes = null;
    Size size = null;

    Drinks drinks = null;
    DrinksFactory drinksFactory = null;



    public void serveClient(){

        int choose = waiter.menu(input);
        dishes = waiter.selector(choose, dishes);

        //
        choose = waiter.topping(input);
        dishes = waiter.chooseTopping(choose, dishes);

        //
        choose = waiter.sizes(input);
        size = waiter.chooseSize(choose, size);

        // give menu
        // take order
        // calculate and give cost



        // calculate and give info about time to wait
        // end

        choose = waiter.drinks(input);
        drinks = waiter.chooseDrink(choose, drinksFactory, drinks);



        waiter.getOrderInfo();
        waiter.getOrderPrice();
    }


    public void serveClientSecond(){
        // take dishes
        // give dishes
        // take money
    }

/*    public void cleanerWork(){

    }*/


}
