package day15_String;

import java.util.Scanner;

public class Replit_FirstCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        char firstCharacter = word.charAt(0);
        System.out.println(firstCharacter);

    }
}

/*
Write a program that will print out the first character of the word.
Ex:
Input:
    jump
Output:
    j
 */