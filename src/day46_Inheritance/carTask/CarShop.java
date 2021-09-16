package day46_Inheritance.carTask;

import day43_OOP_Encapsulation.Test;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2010, 5000, "white", 20000);
        toyota.start(); // Insert the key Twist it to the ignition


        Tesla tesla= new Tesla("S model", 2021, 120000, "black", 0);
        tesla.start(); // overridden method Push start button


        BMW bmw=new BMW("X6", 2015, 10000, "Red", 5000);
        bmw.start(); // overridden method - Call mechanic Oil change Jump start


    }
}
