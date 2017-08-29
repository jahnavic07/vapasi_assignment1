package com.assignment1Redone;

public class FruitBasketItem {
    Fruit fruit;
    double qtyPurchased;
    String unitOfPurchase; /*Can be dozens or KG or single piece*/

   FruitBasketItem(Fruit fruit, double qtyPurchased, String unitOfPurchase){
        this.fruit = fruit;
        this.qtyPurchased = qtyPurchased;
        this.unitOfPurchase = unitOfPurchase;
    }

}
