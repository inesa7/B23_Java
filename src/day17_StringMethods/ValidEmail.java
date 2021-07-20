package day17_StringMethods;

import java.util.Scanner;

public class ValidEmail {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email:");
        String email = scan.next();

        boolean isValid = email.endsWith("gmail");
        if(isValid){
            System.out.println("Valid email");
        }else{
            System.out.println("Not a valid email");
        }
        scan.close();

    }
}
/*
write a program to verify if the gmail is valid
requirements:
        a valid gmail account should end with @gmail.com
 */