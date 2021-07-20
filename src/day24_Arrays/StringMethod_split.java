package day24_Arrays;

import java.util.Arrays;

public class StringMethod_split {
    public static void main(String[] args) {
        // split

        String sentence = "I love Java programming language";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >=0; i--) {
            System.out.print(words[i]+" ");
        }

        System.out.println();

        String email = "Cybertek@gmail.com";
        // return the first name from email

        String[] arrays = email.split("@");
        String  firstName = arrays[0];

        //String firstName = email.split("@")[0];

        System.out.println("firstName = " + firstName);


    }
}
