package day13_ScannerMethods;

import java.util.Scanner;

public class BooleanMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("You are full time employee");
        boolean isFullTime = scan.nextBoolean();

        System.out.println("You are an adult");
        boolean adult = scan.nextBoolean();

        System.out.println("You are married");
        boolean isMarried = scan.nextBoolean();

        System.out.println("isMarried = " + isMarried);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("adult = " + adult);
    }
}
