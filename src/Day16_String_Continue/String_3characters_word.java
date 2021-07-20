package Day16_String_Continue;

import java.util.Scanner;

public class String_3characters_word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string with 3 letters");
        String word = scan.next();

        //nested if statement
        if(word.length() == 3){ // if a word has only 3 characters

            if( word.charAt(1) == 'a'){ // if the middle character = 'a'
                System.out.println("Cool word");
            }else{
                System.out.println("Okay word");
            }

        }else{
            // if the word has more than 3 characters or less than 3 characters

            if(word.length()<3){ // if the word has less than 3 characters
                System.out.println("Word is too short");
            }else{ // word has more than 3 characters
                System.out.println("Word is too long");
            }

        }

        scan.close();
    }
}
/*
write a program that asks the user enter a three letter word.
Check if the middle character of the given word is 'a'.
In the case it is print: "Cool word", but in the case the middle letter is not 'a'
print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */