package day23_Arrays;

import java.util.Arrays;
import java.util.Scanner;
// create an array of string that contains names of months

public class Months {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        //index:                0 1 2 3 4 5 6 7 8 9 10 11
        //number of elements:   1 2 3 4 5 6 7 8 9 10 11 12

        System.out.println("Enter a number:");
        int n = new Scanner(System.in).nextInt();
        //System.out.println(months[n-1]);

        Arrays.sort(months);

        if (n > 1 && n <= 12) {
            System.out.println(months[n - 1]);
        } else {
            System.out.println("Invalid number");
        }
    }
}

