package day19;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; // this is the maximum integer number

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt(); // if numbers are: 100 300 50 400 5

            if(number < min){
                min = number;
            }
        }
        System.out.println("min = " + min); // number is 5
        scan.close();

    }
}
/*
ask user to enter a number for 5 times,  then return the minimum number
 */