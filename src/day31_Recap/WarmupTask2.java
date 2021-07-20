package day31_Recap;

import utilities.NumbersUtility;
import utilities.StringUtility;

public class WarmupTask2 {
    public static void main(String[] args) {

        String sentence = "Java java JaVa";
        String word = "java";

        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        while(sentence.contains(word)){
            sentence.replaceFirst(word, "");
            count++;
        }

        System.out.println(count);

        System.out.println("-----------------------------------------------");
        String str = "racecar";
        boolean isPalindrome = StringUtility.isPalindrome(str);
        System.out.println("isPalindrome = " + isPalindrome);

/*        write a return method named frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
        Ex:
        str = "Java java java python python"
       word = "java";
        frequencyOfWord(str, word) ==>  3

 */

        System.out.println("-----------------------------------------------");

        int number = 3;
        boolean number3 = NumbersUtility.isOdd(number);

        System.out.println(number3);
//        NumbersUtility.isOdd(number);
//        System.out.println(number);
//       System.out.println(NumbersUtility.isOdd(number));



    }

    public static int frequencyOfWord(String str, String word){

        int count = 0;
        String sentence ="";
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        while(sentence.contains(word)){
            sentence.replaceFirst(word, "");
            count++;
        }

        return count;

    }
}
