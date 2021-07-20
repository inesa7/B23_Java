package day15_String;

import java.util.Scanner;

public class ReplitLength {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String text = scan.next();
        int length = text.length();

        System.out.println("Length is: " + length);

    }
}
/*
Write a program that will output length of the text (string).
Example:

Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"
 */