package com.assign1objmaps;
import java.util.*;
/** This is the main class for fruit shopping using objects and maps */
public class FruitBasket  extends ItemBill{

    public static void main(String[] args) {

        double fruitCost=0;
        Map<Integer,Fruit> fruitMap=new HashMap<Integer,Fruit>();

        Fruit apple =  new Fruit("Apple", 100.0,0,0);
        Fruit orange = new Fruit("Orange", 80.0,0,0);
        Fruit banana = new Fruit("Banana", 30.0,0,0);
        Fruit kiwi  =  new Fruit("Kiwi", 120.0,0,0);

        //Adding fruits to map
        fruitMap.put(1,apple);
        fruitMap.put(2,orange);
        fruitMap.put(3,banana);
        fruitMap.put(4,kiwi);
        
        calcualteCost(apple,2);
        calcualteCost(orange,1.5);
        calcualteCost(banana,0.5);
        calcualteCost(kiwi,0.75);

        printBill(fruitMap);

    }
}
