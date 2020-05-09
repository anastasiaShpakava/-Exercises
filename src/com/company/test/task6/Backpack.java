package com.company.test.task6;


import java.util.LinkedList;
import java.util.List;

public class Backpack {
    private int maxWeight;
    private int weightNow;
    private List<Thing> things = new LinkedList<>();
    private int cost;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        things.add(thing);
        cost += thing.getCost();
        weightNow += thing.getWeight();
        System.out.println("Thing was added in backpack");

    }

    public void showBackpack() {
        System.out.println("Now is in backpack: ");
        System.out.println("The cost of things in the backpack: " + cost);
        System.out.println("Total weight of things in the backpack: " + weightNow);

        for (Thing thing : things) {
            System.out.println(thing);
        }
    }
}