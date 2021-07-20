package Day16_String_Continue;

import java.util.Scanner;

public class empty_Method {
    public static void main(String[] args) {


        String s1 = "";
        boolean str1 = s1.isEmpty();
        System.out.println("str1 = " + str1); // true

        String s2 = "Hello";
        boolean str2 = s2.isEmpty();
        System.out.println("str2 = " + str2); // false
        
        String s3 = "         ";
        s3=s3.trim();
        boolean str3 = s3.isEmpty();
        System.out.println("str3 = " + str3); //true


        System.out.println("----------------");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scan.nextLine();

        // ex. word "programming"
        if(word.length()==0){
            System.out.println("String is empty");
        }else if(word.length()>3){
            System.out.println(word.substring(word.length()-3));
        }else{
            System.out.println(word);
        }
        //option 2 - using string "result":

        String result = "";

        if(word.length() == 0){
            result = "String is empty";
        }else if(word.length() > 3){
            result = (word.substring( word.length()-3) ); // -3 means 3 indexes from the end of word "programming": -ing
        }else{
            result = word;
        }
        System.out.println(result); //programm

        /*option 3 - using ternary:

        String result = (word.length() == 0) ? "String is empty"
                :(word.length() > 3) ? word.substring( word.length() - 3)
                : word;
          */

        scan.close();
    }
}
/*
write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */

