package day09_IfStatements;
/*
write a program that can print out the maximum number between two different numbers
    Ex:
        num1 = 20;
        num2 = 30;
    output:
            30 is the maximum number
 */
public class MaximumNumber {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 30;

        if(num1 > num2){
            System.out.println(num1+ " is maximum");
        }

        if(num2 > num1){
            System.out.println(num2+" is maximum");
        }
       // or we can use if else statement

        if(num1 > num2){
            System.out.println(num1+ "is maximum");
        }else{
            System.out.println(num2+" is maximum");
        }
    }
}
