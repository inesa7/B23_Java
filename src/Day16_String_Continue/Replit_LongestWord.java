package Day16_String_Continue;

import java.util.Scanner;

public class Replit_LongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        if(word1.length() > word2.length()){ //this is the code if word1 > word2
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }

        if(word1.length() > word2.length()){ // this is the code if word1 >= word2
            System.out.println(word1);
        }else if(word1.length() == word2.length()) {
        }else{
            System.out.println(word2);
        }

        scan.close();
    }
}
/*
Write a program that will print out the longest word.
Note: Assume the length of the two given Strings will be different
input:
bill
check
input:
bill
check
output: check
 */