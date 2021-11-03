package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //кароче здесь всякую херню не создавать, потом будем здесь вызывать only(fans) классы и методы ничего болльшего
        //типо чтобы не заполнять
        Scanner input = new Scanner(System.in);
//        Troop troop = null;
//        Barracks barracks = null;
//
//        while (true) {
//            int choose = menu(input);
//            selector(choose, troop, barracks);
//        }
    }

        public static short menu(Scanner input) {
            short option;
            System.out.println("\nWelcome king, lets train some army!");
            System.out.println("1.Knight");
            System.out.println("2.Marksman");
            System.out.println("3.Wizzard");
            option = input.nextByte();
            return option;
        }

//        public static void selector(int choose, Troop troop, Barracks barracks) {
//            switch (choose) {
//                case 1:
//                    troop = new Knight();
//                    barracks = new KnightBarracks();
//                    break;
//                case 2:
//                    troop = new Marksman();
//                    barracks = new MarksmanBarracks();
//                    break;
//                case 3:
//                    troop = new Wizzard();
//                    barracks = new WizzardBarracks();
//                    break;
//                default:
//                    System.out.println("PLEASE KING, CHOOSE FROM 1 - 3!");
//                    break;
//            }
//            troop.chooseBarracks(barracks);
//            troop.traintroop();
//            troop.improveTroop();
//        }
}
