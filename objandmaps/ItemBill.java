package com.assign1objmaps;

import java.util.*;

abstract class ItemBill {

    //Calculate cost by using the quantity
    static void calcualteCost(Fruit myFruit, double qty) {
        myFruit.qty = qty;
        myFruit.totalPrice = myFruit.price * qty;
    }

    static void printBill(Map<Integer, Fruit> fruitMap) {
        double totalBill = 0;

        System.out.printf("%-10s%-10s%10s\n", "Fruit", "Quantity", "Amount");
        System.out.println("------------------------------------------");

        //Traverse the map and print bill
        for (Map.Entry<Integer, Fruit> entry : fruitMap.entrySet()) {
            int key = entry.getKey();
            Fruit myFruit = entry.getValue();
            System.out.printf("%-10s%-10.2f%10.2f\n", myFruit.name, myFruit.qty, myFruit.totalPrice);
            totalBill += myFruit.totalPrice;
        }

        System.out.println("------------------------------------------");
        System.out.printf("%-10s%-10s%10.2f\n", "Total Bill", " ", totalBill);
    }
}

