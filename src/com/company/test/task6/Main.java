package com.company.test.task6;

import java.util.*;

/* Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
   Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
   Цель задачи - заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
   */

public class Main {
    public static void main(String[] args) {
        List<Thing> things = new LinkedList<>();


        System.out.println("Inter the quantity of things: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfThings = scanner.nextInt();
        System.out.println("Enter the carrying capacity of the backpack: ");
        Scanner scanner1 = new Scanner(System.in);
        int maxWeight = scanner1.nextInt();
        System.out.println("Enter the cost of thing: ");
        Scanner scanner2 = new Scanner(System.in);
        int cost = scanner2.nextInt();
        Backpack backpack = new Backpack(maxWeight);
        for (int i = 0; i < numberOfThings; i++) {
            Thing thing = new Thing(maxWeight, cost);
            things.add(thing);
        }

        System.out.println("Things in the backpack: ");
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }

        System.out.println("Add things to the backpack");
        for (Thing thing : things) {
            backpack.addThing(thing);
        }
        System.out.println("All is done!!! ");
        System.out.println();

        backpack.showBackpack();
    }
}

