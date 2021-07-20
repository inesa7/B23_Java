package Day14_Recap;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number between 1 and 100000:");
        int number = scan.nextInt();
        scan.close();

        if(number>=1 && number<=100000) {

            if(number<=9) {
                System.out.println("1 digit");
            }else if(number<=99) {
                System.out.println("2 digit");
            }else if(number<=999){
                System.out.println("3 digit");
            }else if(number<+9999){
                System.out.println("4 digits");
            }else if(number<=99999){
                System.out.println("5 digits");
            }else{
                System.out.println("6 digits");
            }

        }else {
            System.out.println("Invalid number");
        }

        /* ternary if:
        String result2 = (n >= 1 && n<= 999999)?
                            ( n <= 9) ?  "1 digit" :( n <= 99) ? "2 digits" :(n <= 999)?  "3 digits"
                            :( n <= 9999)? "4 digits" :(n <= 99999)? "5 digits": "6 digits"
                        : "Invalid";

        System.out.println(n+" has " + result);


         */
        scan.close();

            }
        }

/*
Given a number(int) determine and print how many digits it has.
            - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"

            Ex: 124 --> 3 digits
                13213 --> 5 digits
                883218 --> Invalid number
                23 --> 2 digits
                9 --> one digit
                15 --> 2 digits
 */