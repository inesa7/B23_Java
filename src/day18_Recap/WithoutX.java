package day18_Recap;

import sun.jvm.hotspot.jdi.SACoreAttachingConnector;

import java.util.Locale;
import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        //option1: if(word.charAt(0)=='x')...

        if(word.toLowerCase().startsWith("x") ) {
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }
          scan.close();

        System.out.println("---------------------------");
        String sentence = "I love Java programming language";

        //java or Java ==> has Java
        // otherwise ==> does not have Java

        if(sentence.toLowerCase().contains("Java")){ // we can ignore the case sensitivity by creating lowercase version
            System.out.println("Has Java");
        }else{
            System.out.println("Does not have Java");
        }

        System.out.println("---------------------------");

        String s1 = "I love cats and dogs";
        //boolean lovesCats = s1.equalsIgnoreCase("cats");      //verifies if s1 IS "cats"
        boolean lovesCats = s1.toLowerCase().contains("cats"); // verifies if s1 HAS "cats"

    }
}
/*
Ask user to enter a word. If the word contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */