package day19;

import java.util.Scanner;

public class SumOfAnyGivenNumbers {
    public static void main(String[] args) {

        // calculate the sum of all numbers between 1 to any given number

        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        for (int j = 0; j <= number ; j++) {
            sum += j;
        }
        System.out.println("sum = " + sum);

        scan.close();

    }
}
