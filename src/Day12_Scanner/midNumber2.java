package Day12_Scanner;
/*
Write a program that will return mid number out of three numbers. No need to do any calculations.
Create an object of Scanner class.
Declare int 3 variables: num1, num2, num3.
 */
import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class midNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        System.out.println("Enter third number:");
        int num3 = input.nextInt();
        int midNumber;

        if(num1<num2 && num2<num3 || num1>num2 && num2>num3){
            midNumber = num2;
        }else if(num1>num2 && num1<num3 || num1<num2 && num1>num3){
            midNumber = num2;
        }else{
            midNumber = num3;
        }

        System.out.println("midNumber = " + midNumber);
    }
}
