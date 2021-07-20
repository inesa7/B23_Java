package day19;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {

        // print numbers between 1-1000
        for(int i = 0; i <= 1000; i++ ){
            System.out.print(i+" ");
        }
        System.out.println(); // to make sure next print starts from new line
        System.out.println("Hello");

        System.out.println("____________________________________");

        //print all odd numbers between 1-100
         for(int i = 1; i <= 100; i++){
             if(i%2!=0){
                 System.out.print(i+" ");
             }
         }

        System.out.println(); // to make sure next print starts from new line

        System.out.println("____________________________________");

        //print all even numbers between 1-100
        for(int i = 0; i <= 100; i+=2 ){ //i+=2
            System.out.print(i+" ");
        }
        System.out.println(); // to make sure next print starts from new line

        System.out.println("____________________________________");

        //print all even numbers between 1-100
        for (int i = 1; i < 100; i++) { // i++
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(); // to make sure next print starts from new line

        System.out.println("____________________________________");
        String odds = "";
        String evens = "";

        for (int i = 1; i < 101 ; i++) {
            if(i%2!=0){
                odds += i+" ";
            }else{
                evens+= i +" ";
            }
        }
        System.out.println("evens = " + evens);
        System.out.println("odds = " + odds);
        
        // write a program that can calculate the sum of all numbers between 1 to 100

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        System.out.println("sum = " + sum);

        /*
        write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

                input : 200
                output : 20100
         */


    }
}
