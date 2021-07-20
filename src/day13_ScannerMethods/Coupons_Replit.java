package day13_ScannerMethods;
import java.util.Scanner;
public class Coupons_Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();
        int candy = coupons/10;
        int gumball = (coupons%10)/3;

        if(coupons>=10){
            System.out.println("Number of candies:"+candy);
            System.out.println("Number of gumballs:"+gumball);
        }else if(coupons>3 && coupons<10){
            System.out.println("Number of Candies: 0");
            System.out.println("Number of Gumballs: "+coupons/3);
        }else {
            System.out.println("Not enough coupons");
        }
    }
}

        /*
        option 1:
        if(coupons>=10){
            System.out.println("Number of candies:"+candy);
            System.out.println("Number of gumballs:"+gumball);
        }else if(coupons>3 && coupons<10){
            System.out.println("Number of Candies: 0");
            System.out.println("Number of Gumballs: "+coupons/3);
        }else {
            System.out.println("Not enough coupons");
        }

        option 2:
        if(coupons>=3){
            System.out.println("Number of Candies: "+candy +"\n"+ "Number of Gumballs: "+ gumball);}

        option 3:
           if(coupons>=3){
            System.out.println("Number of Candies: "+candy);
            System.out.println("Number of Gumballs: "+ gumball);
        }else if(coupons>=10){
            System.out.println("Number of candies:"+candy);
            System.out.println("Number of gumballs:"+gumball);
        }else {
            System.out.println("Not enough coupons");
        }

/*
The video games machines at your local arcade outputs coupons according to how well you play the game.
You can redeem 10 coupons for a candy bar or 3 for a gumball
Write a program that displays how many candy bars and gumballs you can get. You prefer candy bars.
if the coupons are not enough for any redeem, display message:
"Not enough coupons"
Example:
        Input:
        Enter number of coupons:
        13
        Output: Number of Candies: 1
        Output: Number of Gumballs: 1

        Enter number of coupons:
        23
        Output: Number of Candies: 2
        Output: Number of Gumballs: 1

        Enter number of coupons:
        2
        Output: Not enough coupons
 */