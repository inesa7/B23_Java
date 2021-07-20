package day30_Recap;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class MethodsReview {

    public static void main(String[] args) {

        String str = "Java";

        String result = StringUtility.reverse(str); // need to assign to another variable

        System.out.println(result);

        String word = "Anna";
        System.out.println( StringUtility.isPalindrome(word));

        System.out.println("------------------------------------");

        int[] numbers = {10,20,30};

        int result1 = ArraysUtility.maxNumber(numbers);
        System.out.println(result1);

        int result2 = ArraysUtility.minNumber(numbers);
        System.out.println(result2);

        System.out.println("------------------------------------");

        String str1 = "AAABBBCCCCC";
        //String result3 = StringUtility.removeDuplicates(str);




    }
}
