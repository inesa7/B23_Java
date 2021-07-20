package day13_ScannerMethods;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Drive
        System.out.println("Enter your first name");
        String firstName = scan.next(); // only takes the first word

        System.out.println("Enter your last name");
        String lastName = scan.next(); // only takes the first word

        String fullName = firstName +" "+ lastName;

        System.out.println("fullName = " + fullName);

        System.out.println("Enter your address");
        String address = scan.next(); // 7925

        System.out.println("address = " + address);

    }
}
