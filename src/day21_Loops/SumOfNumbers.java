package day21_Loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        
        while(true){
            System.out.println("Enter a number:");
            int n = scan.nextInt();
            
            if(n<0){
                break;
            }
            
            sum+=n;
            
        }

        System.out.println("sum = " + sum);
    }
}
 /*
    Write a program that calculates the sum of numbers entered by the user
    until user enters a negative number.
    hint: you need an infinite loop
*/