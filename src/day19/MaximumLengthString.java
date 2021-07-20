package day19;

import java.util.Scanner;

public class MaximumLengthString {
    public static void main(String[] args) {
// ask user to enter 5 strings, return the string that has the maximum length

        Scanner scan = new Scanner(System.in);

        String max = "";
            for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a string:");
            String word = scan.nextLine();


            if (word.length() > max.length() ) {
                max = word;
            }
        }
        System.out.println("max = " + max);
    }
}









