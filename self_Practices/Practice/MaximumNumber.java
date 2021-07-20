package Practice;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int maximumNumber = -2147000000;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number:");
            number = scan.nextInt();
            if(number>maximumNumber){
                maximumNumber=number;
            }

        }
        System.out.println(maximumNumber);
    }
}
//ask user to enter a number for 5 times,  then return the maximum number