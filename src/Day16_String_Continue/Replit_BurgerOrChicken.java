package Day16_String_Continue;

import java.util.Scanner;

public class Replit_BurgerOrChicken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item:");
        String in = scan.next();
        double price = 0;

        if(in.equals("burger") || in.equals("chicken")){
            price = 10.0;
        }else if(in.equals("fries")) {
            price = 3.5;
        }else if(in.equals("soda")){
                price = 2.0;
            }

            System.out.println(price);
        }
        }

/*
A fast food company has two main order types, burger meal and chicken meal.
Both have the same prices, so if a cashier enters "burger" or "chicken "
he will get the same price of 10.0.

If the order is burger price is 10.0
If the order is chicken price is 10.0
If the order is soda price is 2.0
If the order is fries price is 3.5
hint: or operator in java is ||

Examples:

burger
10.0

chicken
10.0

soda
2.0
 */