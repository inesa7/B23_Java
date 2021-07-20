package day28_Methods;

import java.util.Scanner;

public class VoidMethodPractice {
    public static void main(String[] args) {

        // using scanner
        // Scanner scan = new Scanner(System.in);
        //printOddNumbers(scan.nextInt(), scan.nextInt());

        //task 1:
        printOddNumbers(1, 100);

        // task 2:
        printEvenNumbers(1, 100);

        //task 3:
        calculateAge(1982);

        //task 4:
        eligibleToVote(25, true);

        //task 5:
        calculate(100, 200, '+');

    }

    // task 1: create a method that can print odd numbers between 1~100 in a same line separated by space
    public static void printOddNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

    }

    //task 2: create a method that can print even numbers between 1~100

    public static void printEvenNumbers(int from, int to){
        for (int i = from; i < to; i++) {
            if(i % 2 == 0){
                System.out.print( i + " ");
            }
        }

        System.out.println();

    }

    // task 3: create a method that can calculate the age of the person

    public static void calculateAge(int birthYear){

        System.out.println("Your age is "+ (2021 - birthYear));
    }

    // task 4: check eligibility to vote

    public static void eligibleToVote(int age, boolean isUSCitizen) {

        if (age >= 21 && isUSCitizen) {
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }

    // task 5:

    public static void calculate(int num1, int num2, char operator){

        switch(operator){
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;

            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;

            case '*':
                System.out.println("Multiplicatio: "+(num1*num2));
                break;

            case '/':
                System.out.println("Division: "+(num1/num2));
                break;

            default:
                System.out.println("Invalid operator");
        }
    }

}
/*
task:
    1. create a method that can print odd numbers between 1~100 in a same line separated by space

    2. create a method that can print even numbers between 1~100

    3. create a method that can calculate the age of the person

    4. check eligibility to vote
 */