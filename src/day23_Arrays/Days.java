package day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fr", "Sat", "Sun"};
        // index:           0     1      2       3      4     5      6
        // size:            1     2      3       4      5     6      7
        System.out.println("Enter a number:");
        int numbers = new Scanner(System.in).nextInt();

        System.out.println(days[numbers-1]); // because index is length -1


    }
}
