package day40_Custom_Class_Statics.Address;

import java.util.Scanner;

public class AdressObjects {

    public static void main(String[] args) {

        Address address = new Address(); // new object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number:");
        String building = scan.next();

        scan.nextLine(); // Enter

        System.out.println("Enter your street name:");
        String street = scan.nextLine();

        System.out.println("Enter your city:");
        String city = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.nextLine();

        System.out.println("Enter your zip code:");
        int zipCode = scan.nextInt();

        address.setInfo(building, street, city, state, zipCode);
        System.out.println(address);
        System.out.println(Address.country); // legal way to call static variable country from the class
        //System.out.println(address.country); // illegal way to call static variable country

    }
}
/*
Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
 */