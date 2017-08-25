package com.assign1objmaps;

public class Fruit {
    String name;
    double price;
    double qty;
    double totalPrice;

    Fruit(String name, double price,double qty,double totalPrice ){
        this.name=name;
        this.price=price;
        this.qty=0;
        this.totalPrice=0;
    }

   /* double calcualteCost(double qty){
        System.out.printf("%-10s%-10.2f%10.2f\n", name, price, price*qty);
        return price*qty;
    }*/
}
