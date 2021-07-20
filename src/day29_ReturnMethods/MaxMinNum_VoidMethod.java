package day29_ReturnMethods;

public class MaxMinNum_VoidMethod {
    public static void main(String[] args) {
        maxNumber(10,20);
        minNumber(30,15);

    }

    public static void maxNumber(int num1, int num2){

        System.out.println((num1 > num2) ? num1 : num2+ " is maximum number"); // ternary
    }

    public static void minNumber(int num1, int num2){

        System.out.println((num1 < num2) ? num1 : num2+ " is minimum number"); // ternary
    }
}

//create a function that can print out the maximum/minimum number between two numbers
