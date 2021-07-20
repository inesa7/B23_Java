package day17_StringMethods;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        //option 1: boolean endsWithLy = word.substring(word.length()-2).equals("ly");
        boolean endsWithLy = word.endsWith("ly");

        if(endsWithLy){
            System.out.println("really?");
        }else{
            System.out.println("Never mind");

            scan.close();

        }
    }
}
