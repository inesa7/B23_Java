package day13_ScannerMethods;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = scan.nextInt();

        System.out.println("Enter your gender");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter your fullName");
        String fullName = scan.nextLine();

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);

    }
}
/*
ask:
1. salary (nextInt)
2. gender( next() )
3. fullName( next () )
 */