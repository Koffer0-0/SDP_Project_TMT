package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int choose = menu(input);
            selector(choose);
        }
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

    public static void selector(int choose) {
        switch (choose) {
            case 1:
//                troop = new Knight();
//                barracks = new KnightBarracks();
                break;
            case 2:
//                troop = new Marksman();
//                barracks = new MarksmanBarracks();
                break;
            case 3:
//                troop = new Wizzard();
//                barracks = new WizzardBarracks();
                break;
            default:
                System.out.println("ОШИБКА! Выберите вариант от 1 до 3!");
                break;
        }
    }
}
