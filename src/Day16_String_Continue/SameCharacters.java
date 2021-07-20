package Day16_String_Continue;

import java.util.Scanner;

public class SameCharacters {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a word:");
                String word = scan.next();

                String first = word.substring(0,1);
                String last = word.substring(word.length()-1);

                if(first.equalsIgnoreCase(last)){
                    System.out.println("same");
                }else{
                    System.out.println("not same");
                }

                     scan.close();


            }
        }


/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */