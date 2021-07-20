package day15_String;

import java.util.Scanner;

public class Replit_FirstLastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);

        System.out.println(firstLetter+""+lastLetter);
    }
}
/*
Write a program that will print out first and last letters together.
    Input:
        adobe
    Output:
        ae
 */