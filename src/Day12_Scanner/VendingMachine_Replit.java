package Day12_Scanner;
import java.util.Scanner;

public class VendingMachine_Replit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much cents:");
        int cents = input.nextInt(); // if input is 93

        if(cents <= 100 && cents >= 0){
                    int quarter = cents/25,
                    dimes = (cents%25)/10,
                    nickels = (cents%25)%10/5,
                    pennies = (cents%25)%10%5;

            System.out.println("Your change is "+ quarter + " quarters, " + dimes + " dimes, " + nickels + " nickels and "
                    + pennies + " pennies");

        }else{
            System.out.println("Invalid cents amount");

            /* option 2:
            int quarters = cents / 25; //93/25=3 quarters
            int cents1 = cents % 25; //93%25 = 18 cents
            int dimes = cents1 / 10; //18/10=1
            int cents2 = cents1 % 10; //8
            int nickels = cents2 / 5; //1
            int cents3 = cents2 % 5; //3
            int pennies = cents3; //3
            */
        }

    }
}
/*
Write a program that will determine the change given from the vending machine.
The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.
The given cents value should be more than 0 and less than 100.
If the given cents is not in the range print "Invalid cents amount" and there should be no other output after
In valid cases print the change in this format: Your change is x quarters, x dimes, x nickels, and x pennies
Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
 */