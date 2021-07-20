package day22_Recap;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";

        do{
            System.out.println("Enter two numbers:");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Addition: " + (n1 + n2));
            System.out.println("Do you want to continue?");
            answer = scan.next();

            while( ! (answer.equals("yes") || answer.equals("no") )){ // while the answer is not yes or no, repeatedly
                System.out.println("Invalid Answer, Please re-enter");
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();
            }

        }while(answer.equalsIgnoreCase("yes"));

        scan.close();

        }
    }

/*
write a program that will ask user to enter two numbers and calculates
the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
 */