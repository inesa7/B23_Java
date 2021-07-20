package day15_String;

import java.util.Scanner;

public class ReverseString { // need to reverse index:01234
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.next();

        String result = "";

        if(word.length()>5){
            result = "Too long";
        }else if(word.length()<5){
            result = "Too short";
        }else{
            result+=word.charAt(4);
            result+=word.charAt(3);
            result+=word.charAt(2);
            result+=word.charAt(1);
            result+=word.charAt(0);

            // word "Black"
            result = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        }               //          k              c              a              l              B

        System.out.println(result);

    }
}
/*
Write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */