package day19;

import java.util.Scanner;

public class Replit_asterics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();

        for (int i = 1; i <=5; i++) {
            System.out.println("*");

        }

    }
}
/*
Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.
    Example:
        input: 1
        output: *
    Example:
        input: 3
        output: ***
 */