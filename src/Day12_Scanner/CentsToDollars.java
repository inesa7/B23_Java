package Day12_Scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents");
        int cents = scan.nextInt(); // 225 cents,  300 cents
        int dollars = cents / 100; // $2,          $3
        int remainder = cents % 100; //25 cents,   0 cents -- this is to calculate if there is any remainder

        if(cents>=0) { // if the input is valid

            if (remainder == 0) {
                System.out.println(cents + " cents equal to " + dollars + " dollars");
            } else {
                System.out.println(cents + " cents equal to " + dollars + " dollars and " + remainder + " cents");
            }

            }else{// if the input is not valid
            System.err.println("Invalid Amount");
        }

    }
    }

            /*
            Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

                Enter cents
                300 cents equal to: 3 dollars
             */

