package com.assignments;

import java.util.*;

/**
 * This class is the main class to add the fruits cost, add the shopping list and to get the cost of the fruits shopping
 */

public class FruitShopping {
    public static void main(String[] args) {

        Fruits myFruits = new Fruits();

        //Create the fruit map containing the fruits and the corresponding costs
        Map<String, Integer> fruitMap = myFruits.fruitsCatalog();
        fruitMap.put("Apple", 100);
        fruitMap.put("Orange", 80);
        fruitMap.put("Banana", 30);
        fruitMap.put("Kiwi", 120);

        //Create the quantity map containing the fruits and the corresponding quantities purchased
        Map<String, Float> qtyMap = myFruits.shoppingList();
        qtyMap.put("Apple", 2.0f);
        qtyMap.put("Orange", 1.5f);
        qtyMap.put("Banana", 0.5f);
        qtyMap.put("Kiwi", 0.75f);

        //Calculate and Print the cost of the shopping
        myFruits.calculateCost(fruitMap, qtyMap);


    }
}
