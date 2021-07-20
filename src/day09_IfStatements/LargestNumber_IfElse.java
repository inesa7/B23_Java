package day09_IfStatements;
/*
Declare 3 numbers
Program should display which one is largest
 */
public class LargestNumber_IfElse {
    public static void main(String[] args) {

        int num1 = 10, num2 = 20, num3 = 30;

        if(num1>num2){
            System.out.println(num1+" is largest");
        }else if(num2>num3){
            System.out.println(num2+" is largest");
        }else if(num3>num2){
            System.out.println(num3+" is largest");
        }

    }
}
