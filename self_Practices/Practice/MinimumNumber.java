package Practice;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minimumNumber = 2147000000;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();

            if(number<minimumNumber){
                minimumNumber=number;
            }

        }
        System.out.println(minimumNumber);
    }
}
//ask user to enter a number for 5 times,  then return the minimum number