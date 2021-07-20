package Practice;

import java.util.Scanner;

public class NumberTenTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 0;
        int sum = 0;

        for (int i = 1; i <=10; i++) {
            System.out.println("Enter a number:");
            number = scan.nextInt();
            sum+=number;

        }

        System.out.println(sum);
    }
}
//ask user to enter a number 10 times . find the sum of 10 numbers