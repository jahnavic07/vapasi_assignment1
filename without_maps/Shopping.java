package com.assignment1;

public class Shopping {

    public static void main(String[] args) {

        double totalCost = 0f;

        Fruit apple =  new Fruit("Apple", 100.0);
        Fruit orange = new Fruit("Orange", 80.0);
        Fruit banana = new Fruit("Banana", 30.0);
        Fruit kiwi  =  new Fruit("Kiwi", 120.0);

        System.out.printf("%-10s%-10s%10s\n", "Fruit", "Quantity", "Amount");
        System.out.println("------------------------------------------");

        totalCost += apple.calcualteCost(2.0);
        totalCost += orange.calcualteCost(1.5);
        totalCost += banana.calcualteCost(0.5);
        totalCost += kiwi.calcualteCost(0.75);

        System.out.println("------------------------------------------");
        System.out.printf("%-10s%-10s%10.2f", "Total Cost", " ", totalCost);
    }
}
