package com.company.facadePattern;

import com.company.bridgePattern.Size;
import com.company.entities.Dishes;
import com.company.entities.Waiter;

import java.util.Scanner;

public class ServiceFacade {
    private Waiter waiter;

    Scanner input = new Scanner(System.in);

    Dishes dishes = null;
    Size size = null;



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

        waiter.getOrderPrice();


        // calculate and give info about time to wait
        // end

        System.out.println("");
    }

    public void takeOrder(){
        // take order info(id, what dishes to cook)
        // cook
        // give to waiter
    }

    public void serveClientSecond(){
        // take dishes
        // give dishes
        // take money
    }

    public void cleanerWork(){

    }


}
