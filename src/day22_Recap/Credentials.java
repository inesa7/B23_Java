package day22_Recap;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        String correctUsername = "cybertek";
        String correctPassword = "cybertek12345";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username:");
        String u = scan.next();

        System.out.println("Enter password:");
        String p = scan.next();


        if(u.equals(correctUsername) && p.equals(correctPassword)){
            System.out.println("Logged in");

        }else{ // if user provides incorrect username or password

            for(int i = 1; i <= 3; i++){

                System.out.println("username or password is incorrect, please re-enter");
                System.out.println("Enter username:");
                u = scan.next();

                System.out.println("Enter password:");
                p = scan.next();

                if(u.equals(correctUsername) && u.equals(correctPassword)) {
                    System.out.println("Logged in");
                    break;
                }

                if(i==3){
                    System.out.println("Your account is locked");
                    System.exit(0);
                }

            }
        }
    }
}
/*
        You are writing a code for the log-in function of the Cybertek Application,
        assume that your credentials are:
                        username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user
                to have three attempts to enter correct credentials and
                if all three attempts are failed, then print "Your account is locked."
 */