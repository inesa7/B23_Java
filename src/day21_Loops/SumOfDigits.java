package day21_Loops;

import java.sql.SQLOutput;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "A1B2C3";
        int sum = 0;

        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);

            if(each>='0' && each<= '9'){
                sum+=each - 48;
            }



        }


    }
}
/*
Write a program that can return the sum of digits from a string
             Ex:
                 input: A1B2C3
                 output:    6
 */