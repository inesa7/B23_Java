package day17_StringMethods;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter website");

        String url = scan.next();
        boolean isValid = url.startsWith("www.") && url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov");

        if(isValid){
            System.out.println("Valid website");
        }else{
            System.out.println("Not a valid website");
        }

        scan.close();




    }
}
/*
write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */