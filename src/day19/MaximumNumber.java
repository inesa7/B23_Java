package day19;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648;// whatever user enters it will be larger than -2147483648 (the smallest integer number)

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();

            if(number >max){ // if user entered number is greater than the max value
                max = number; // then user entered number will be assigned to max variable
            }
        }

        System.out.println("max = " + max);
        scan.close();
    }
}
/*
ask user to enter a number for 5 times,  then return the maximum number
 */