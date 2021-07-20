package Day16_String_Continue;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scan.next();

        System.out.println("Enter last name:");
        String lastName = scan.next();

        String initial = firstName.substring(0,1).toUpperCase() + "."
                + lastName.substring(0,1).toUpperCase();
        System.out.println("initial = " + initial);

        scan.close();
    }
}

        /* option 2:

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial = initial.toUpperCase();

            option 3:

        String initial = firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase(),charAt(0);
        */

/*
write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
 */