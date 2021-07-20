package day15_String;

import java.util.Scanner;

public class CapitalizationNameFormatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:"); // mUHtaR
        String firstName = scan.nextLine().trim(); // if user inputs first name with white spaces
        firstName = firstName.substring(0,1).toUpperCase()  + firstName.substring(1).toLowerCase(); // Muhtar

        System.out.println("Enter your last name");
        String lastName = scan.nextLine().trim();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName+" "+lastName; // need to add a string "" in concatenation

        System.out.println(fullName);

    }

    }

/*
ask the user to enter first name:
    1. make sure there is no white space
    2. make sure 1-st character is upper case & the rest should be in lower case
 */