package day15_String;

import java.util.Scanner;

public class length_method {
    public static void main(String[] args) {

        String sentence = "Hello everyone, how are you all today?";
        int totalNumberOfChars = sentence.length();
        System.out.println("totalNumberOfChars = " + totalNumberOfChars); // 38

        System.out.println("-----------------------------------");
        // to display the first and last character in the string:

        String str = "Cybertek";  // chars:8     index: 01234567
        int lastIndex = str.length()-1;
        //in order to get the last index number we need to subtract one from the length of String
        char firstCharacter = str.charAt(0);
        char lastCharacter = str.charAt( lastIndex  );

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("-----------------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two strings:");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        if (s1.length() > s2.length()) {
            System.out.println(s1);
        }else if(s1.length() == s2.length()){
            System.out.println("Equal");
        }else{
            System.out.println(s2);
        }

    }
}
//write a program that asks user to enter two strings, and print out the longest string