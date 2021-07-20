package Day16_String_Continue;

import java.util.Scanner;

public class SubstringTwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");

        String word1 = scan.next(); // "Apple"
        String word2 = scan.next(); // "Banana"

        if(word1.length()>=2 && word2.length() >=2 ) {
            String result = word1.substring(1) + word2.substring(1);
            System.out.println(result);
        }else{
            System.out.println("Too short");
        }
        scan.close();
    }
}
/*
Ask user to enter two words. Print first word without its first character,
then print the second word without its first character.
        Input:
           apple
           banana
        Output:
            ppleanana
 */