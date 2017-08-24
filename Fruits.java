package com.assignments;

import java.util.HashMap;
import java.util.Map;

public class Fruits {

    Map<String, Integer> fruitsCatalog() {
        return new HashMap<String, Integer>();
    }

    Map<String, Float> shoppingList() {
        return new HashMap<String, Float>();
    }

    //Function to calculate and print the cost of shopping by for each of the fruits purchased

    void calculateCost(Map<String, Integer> fruitMap, Map<String, Float> qtyMap) {
        float fruitCost = 0.0f, totalCost = 0.0f;

        System.out.printf("%-10s%-10s%10s\n", "Fruit", "Quantity", "Amount");
        System.out.println("------------------------------------------");

        for (Map.Entry m : qtyMap.entrySet()) {
            if (fruitMap.containsKey(m.getKey())) {
                fruitCost = fruitMap.get(m.getKey()) * qtyMap.get(m.getKey());
                System.out.printf("%-10s%-10.2f%10.2f\n", m.getKey(), qtyMap.get(m.getKey()), fruitCost);
                totalCost = totalCost + fruitCost;
            }
        }
        System.out.println("------------------------------------------");
        System.out.printf("%-10s%-10s%10.2f", "Total Cost", " ", totalCost);

    }

}