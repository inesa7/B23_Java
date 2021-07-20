package Tasks;

import java.util.Scanner;

public class EmailPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.next();

        //Input: craig.federighi@apple.com

        int indexOfDot = email.indexOf(".");
        int indexOfAt = email.indexOf("@");
        int indexOfLastDot = email.lastIndexOf(".");

        System.out.println("First name: "+email.substring(0, 1).toUpperCase()+email.substring(1,indexOfDot).toLowerCase());
        System.out.println("Last name: "+email.substring(indexOfDot+1, indexOfDot+2).toUpperCase()+email.substring(indexOfDot+2,indexOfAt).toLowerCase());
        System.out.println("Domain: "+email.substring(indexOfAt+1, indexOfLastDot));
        System.out.println("Domain: "+email.substring(indexOfLastDot+1));


    }
}
/*
Write a program that will print out information about user based on email.
Print first name, last name, and domain. First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.

Example:
        Input: craig.federighi@apple.com
        Input: craig.federighi@apple.com
                    Output:
                            First name: Craig
                            Last name: Federighi
                            Domain: apple
 */