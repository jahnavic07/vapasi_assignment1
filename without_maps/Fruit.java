package com.assignment1;

public class Fruit {
    String name;
    double price;

    Fruit(String name, double price ){
        this.name=name;
        this.price=price;
    }

    double calcualteCost(double qty){
        System.out.printf("%-10s%-10.2f%10.2f\n", name, price, price*qty);
        return price*qty;
    }
}
