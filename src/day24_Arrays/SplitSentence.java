package day24_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");


        for(int i = 0; i<=words.length -1; i++) {
            System.out.println(words[i]);

        }
        }
    }

/*
Given a String variable sentence, write code to type each word in separate lines.
        Example:   sentence -> "Java is fun"
        Print

            Java
            is
            fun
 */