package Practice;

import java.util.Scanner;

public class
RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();

        String result = "";
        for(int i = 0; i <= 4; i++ ) {
            if (!result.contains("" + word.charAt(i))) {
                result += word.charAt(i);
            }
        }
            System.out.println(result);





    }
}
/*
ask the user to enter a word. the word must be five characters long and print the word
without the duplicated characters,
but if the word is less than five characters long, print "Too Short."
and if the word is more than five characters long, print "Too long."

		Ex:
			input:
				aabbc

			 output:
			 	abc

 */