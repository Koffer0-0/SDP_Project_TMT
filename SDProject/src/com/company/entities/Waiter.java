package com.company.entities;

import com.company.bridgePattern.Large;
import com.company.bridgePattern.Medium;
import com.company.bridgePattern.Size;
import com.company.bridgePattern.Small;
import com.company.decoratorPattern.Beef;
import com.company.decoratorPattern.Chicken;
import com.company.decoratorPattern.Lamb;
import com.company.factoryPattern.*;
import com.company.observerPattern.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Waiter {

    private List<Dishes> dishesList = new ArrayList<>();
    private int OrderPrice;
    private String sizeInfo;
    private List<Drinks> drinksList = new ArrayList<>();


    private Client client = new Client("Damir Bolat");

    private Order order;

    public short menu(Scanner input) {
        short option;
        System.out.println("\nДобро пожаловать в СТОЛОВКУ, что желаете заказать?");
        System.out.println("1. Гуляш");
        System.out.println("2. Манты");
        System.out.println("3. Самсу");
        option = input.nextByte();
        return option;
    }

    public short topping(Scanner input) {
        short option;
        System.out.println("С каким мясом вы препдпочитаете?");
        System.out.println("1. Говядина");
        System.out.println("2. Ягнятина");
        System.out.println("3. Куринный");
        option = input.nextByte();
        return option;
    }


    public short sizes(Scanner input) {
        short option;
        System.out.println("Какую порцию хотите?");
        System.out.println("1. Большую");
        System.out.println("2. Среднюю");
        System.out.println("3. Маленькую");
        option = input.nextByte();
        return option;
    }

    public Dishes selector(int choose, Dishes dishes) {
        switch (choose) {
            case 1:
                dishes = new Goulash();
                break;
            case 2:
                dishes = new Manty();
                break;
            case 3:
                dishes = new Samsa();
                break;
            default:
                System.out.println("ОШИБКА! Выберите вариант от 1 до 3!");
                System.out.println("ПОПРОБУЙТЕ ЗАНОВО!");
                System.out.println("-----------------------------------");
                break;
        }

        dishes.display();
        dishesList.add(dishes);
        System.out.println("Стоимость " + dishes.cost());
        OrderPrice += dishes.cost();
        return dishes;
    }

    public Dishes chooseTopping(int choose, Dishes dishes) {
        switch (choose) {
            case 1:
                dishes = new Beef(dishes);
                break;
            case 2:
                dishes = new Lamb(dishes);
                break;
            case 3:
                dishes = new Chicken(dishes);
                break;
            default:
                System.out.println("ОШИБКА! Выберите вариант от 1 до 3!");
                System.out.println("ПОПРОБУЙТЕ ЗАНОВО!");
                System.out.println("-----------------------------------");
                break;
        }
        System.out.println("Стоимость топпинга: " + dishes.cost());
        OrderPrice += dishes.cost();
        dishesList.add(dishes);
        return dishes;
    }

    public Size chooseSize(int choose, Size size) {
        switch (choose) {
            case 1:
                size = new Large();
                break;
            case 2:
                size = new Medium();
                break;
            case 3:
                size = new Small();
                break;
            default:
                System.out.println("ОШИБКА! Выберите вариант от 1 до 3!");
                System.out.println("ПОПРОБУЙТЕ ЗАНОВО!");
                System.out.println("-----------------------------------");
                break;
        }
        System.out.println("Стоимость размера: " + size.cost());
        OrderPrice += size.cost();
        return size;
    }

    public short drinks(Scanner input) {
        short option;
        System.out.println("Выберете напиток");
        System.out.println("1. Американо");
        System.out.println("2. Латте");
        System.out.println("3. Индийский чай");
        System.out.println("4. Узбекский чай");
        System.out.println("5. пасеба не нада");
        option = input.nextByte();
        return option;
    }

    public Drinks chooseDrink(int choose, DrinksFactory drinksFactory, Drinks drinks) {
        switch (choose) {
            case 1:
                drinksFactory = new AmericanoFactory();
                break;
            case 2:
                drinksFactory = new LatteFactorty();
                break;
            case 3:
                drinksFactory = new IndianTeaFactory();
                break;
            case 4:
                drinksFactory = new UzbekTeaFactory();
                break;
            case 5:
                //just пропуск
                break;
            default:
                System.out.println("ОШИБКА! Выберите вариант от 1 до 5!");
                System.out.println("ПОПРОБУЙТЕ ЗАНОВО!");
                System.out.println("-----------------------------------");
                break;
        }
        drinks = drinksFactory.createDrink();
        System.out.println("Стоимость: " + drinks.cost());
        OrderPrice += drinks.cost();
        drinksList.add(drinks);
        return drinks;
    }

    public void getOrderPrice(){
        System.out.println("Ваш суммарный счет заказа - " + OrderPrice);
    }

    public void getOrderInfo(){
        System.out.println("Dishes: " + dishesList.toString() + "\n" +
                    "Drinks: " + drinksList.toString());
    }

}
