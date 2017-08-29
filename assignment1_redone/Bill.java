package com.assignment1Redone;

import java.util.*;

public class Bill {
    FruitPrice fruitPrice;
    FruitBasketItem fruitBasketItem;

   /* BillItem(FruitPrice fruitPrice,FruitBasketItem fruitBasketItem){
        this.fruitPrice = fruitPrice;
        this.fruitBasketItem = fruitBasketItem;
    }*/

    public void GenerateBill(Map<Integer, FruitBasketItem> myBasket, Map<Integer, FruitPrice> priceCatalog) {

        double fruitCost = 0, totalCost = 0;

        System.out.printf("%-10s%-10s%10s\n", "Fruit", "Quantity", "Amount");
        System.out.println("------------------------------------------");

        for (Map.Entry<Integer, FruitBasketItem> entry1 : myBasket.entrySet()) {
            FruitBasketItem myBasketItem = entry1.getValue();
            Fruit myFruit = myBasketItem.fruit;
            for (Map.Entry<Integer, FruitPrice> entry2 : priceCatalog.entrySet()) {
                FruitPrice myFruitPrice = entry2.getValue();
                if (myFruit.name == myFruitPrice.fruitName) {
                    fruitCost = myBasketItem.qtyPurchased * myFruitPrice.pricePerUnit;
                    System.out.printf("%-10s%-10.2f%10.2f\n", myFruit.name, myBasketItem.qtyPurchased, fruitCost);
                }
            }
            totalCost = totalCost + fruitCost;
        }

        System.out.println("------------------------------------------");
        System.out.printf("%-10s%-10s%10.2f\n", "Total Bill", " ", totalCost);
    }
}
