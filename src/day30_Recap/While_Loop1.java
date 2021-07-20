package day30_Recap;

import java.util.Scanner;

public class While_Loop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";

        while (! answer.equals("no")){ // false: if the answer is "no"

            System.out.println("Enter a number:");
            int number = scan.nextInt();
            System.out.println(" Would you like to enter another number?");
            answer = scan.next();

            while (! (answer.equals("yes") || answer.equals("no")) ){ // false: if the answer is "yes" or "no"
                System.out.println(" Invalid answer! Would you like to enter another number?");
                answer = scan.next();
            }

        }

    }
}
