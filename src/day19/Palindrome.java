package day19;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //racecar
        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();
        String reverseWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverseWord+=word.charAt(i);

        }
        boolean isPalindrome = word.equalsIgnoreCase(reverseWord);
        System.out.println("isPalindrome = " + isPalindrome);

    }
}
/*
verify if the word is palindrome
 */