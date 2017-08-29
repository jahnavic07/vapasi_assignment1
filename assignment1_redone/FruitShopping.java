package com.assignment1Redone;
import java.util.*;
public class FruitShopping {

    public static void main(String[] args) {

        Fruit apple = new Fruit("Apple", "Red");
        Fruit orange = new Fruit("Orange", "Yellow");
        Fruit banana = new Fruit("Banana", "Yellow");
        Fruit kiwi = new Fruit("Kiwi", "Brown");

        FruitBasketItem myApple  = new FruitBasketItem(apple,2.0,"KG");
        FruitBasketItem myOrange  = new FruitBasketItem(orange,1.5,"KG");
        FruitBasketItem myBanana  = new FruitBasketItem(banana,0.5,"KG");
        FruitBasketItem myKiwi  = new FruitBasketItem(kiwi,0.75,"KG");

        Map<Integer,FruitBasketItem> myBasket = new HashMap<Integer,FruitBasketItem>();
        myBasket.put(1,myApple);
        myBasket.put(2,myOrange);
        myBasket.put(3,myBanana );
        myBasket.put(4,myKiwi);

        FruitPrice applePrice = new FruitPrice("Apple",100,"KG");
        FruitPrice orangePrice = new FruitPrice("Orange",80,"KG");
        FruitPrice bananaPrice = new FruitPrice("Banana",30,"KG");
        FruitPrice kiwiPrice = new FruitPrice("Kiwi",120,"KG");

        Map<Integer,FruitPrice> priceCatalog = new HashMap<Integer,FruitPrice>();
        priceCatalog.put(1,applePrice);
        priceCatalog.put(2,orangePrice);
        priceCatalog.put(3,bananaPrice);
        priceCatalog.put(4,kiwiPrice);

        Bill myFruitBill = new Bill();
        myFruitBill.GenerateBill(myBasket,priceCatalog);

    }


}
