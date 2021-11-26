package com.company;

import com.company.bridgePattern.Large;
import com.company.bridgePattern.Size;
import com.company.decoratorPattern.Beef;
import com.company.decoratorPattern.Chicken;
import com.company.decoratorPattern.Lamb;
import com.company.entities.Dishes;
import com.company.entities.Goulash;
import com.company.entities.Manty;
import com.company.entities.Samsa;

import java.nio.channels.ScatteringByteChannel;
import java.security.Guard;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dishes dishes = null;
        Size size = null;

        //
        int choose = menu(input);
        dishes = selector(choose, dishes);

        //
        choose = topping(input);
        dishes = chooseTopping(choose, dishes);

        //
        choose = sizes(input);
        size = chooseSize(choose, size);

    }

    public static short menu(Scanner input) {
        short option;
        System.out.println("\nДобро пожаловать в СТОЛОВКУ, что желаете заказать?");
        System.out.println("1. Гуляш");
        System.out.println("2. Манты");
        System.out.println("3. Самсу");
        option = input.nextByte();
        return option;
    }

    public static short topping(Scanner input) {
        short option;
        System.out.println("С каким мясом вы препдпочитаете?");
        System.out.println("1. Говядина");
        System.out.println("2. Ягнятина");
        System.out.println("3. Куринный");
        option = input.nextByte();
        return option;
    }

    public static short sizes(Scanner input) {
        short option;
        System.out.println("Какую порцию хотите?");
        System.out.println("1. Большую");
        System.out.println("2. Среднюю");
        System.out.println("3. Маленькую");
        option = input.nextByte();
        return option;
    }

    public static Dishes selector(int choose, Dishes dishes) {
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
        System.out.println("Стоимость " + dishes.cost());
        return dishes;
    }

    public static Dishes chooseTopping(int choose, Dishes dishes) {
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
        return dishes;
    }

    public static Size chooseSize(int choose, Size size) {
        switch (choose) {
            case 1:
                size = new Large();
                break;
            case 2:
                size = new Large();
                break;
            case 3:
                size = new Large();
                break;
            default:
                System.out.println("ОШИБКА! Выберите вариант от 1 до 3!");
                System.out.println("ПОПРОБУЙТЕ ЗАНОВО!");
                System.out.println("-----------------------------------");
                break;
        }
        System.out.println("Стоимость размера:" + size.cost());
        return size;
    }
}
