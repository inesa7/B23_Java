package Day12_Scanner;

import java.util.Scanner;

public class midNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter third number:");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 < num3) {
            System.out.println("Mid number is: " + num1);
        } else if (num1 < num2 && num1 > num3) {
            System.out.println("Mid number is: " + num1);

        } else if (num1 < num2 && num2 < num3) {
            System.out.println("Mid number is: " + num2);
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Mid number is: " + num2);

        } else if (num3 < num2 && num1 < num3) {
            System.out.println("Mid number is: " + num3);
        } else if (num1 > num3 && num2 < num3) {
            System.out.println("Mid number is: " + num3);
        }
    }
}
/*
Write a program that will return mid number out of three numbers. No need to do any calculations.
Create an object of Scanner class.
Declare int 3 variables: num1, num2, num3.
 */