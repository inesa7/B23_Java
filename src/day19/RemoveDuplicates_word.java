package day19;

import java.util.Scanner;

public class RemoveDuplicates_word {
    public static void main(String[] args) {

        String word = new Scanner(System.in).next();  // if the word is "aabbc";

        String result = "";

        if(word.length()==5) {

            if (!result.contains("" + word.charAt(0))) {
                result += word.charAt(0); //'a' not contained in the result
            }        //+= means concated
            if (!result.contains("" + word.charAt(1))) {
                result += word.charAt(1); //'a'
            }
            if (!result.contains("" + word.charAt(2))) {
                result += word.charAt(2); //'b'
            }
            if (!result.contains("" + word.charAt(3))) {
                result += word.charAt(3); //'b'     "ab"
            }
            if (!result.contains("" + word.charAt(4))) {
                result += word.charAt(4); //'c'    "abc"
            }


        }else if(word.length()>5){
            result = "Too long";
        }else{
            result = "Too short";
        }

        System.out.println(result);

    }
}
/*
ask the user to enter a word. the word must be five characters long and
print the word without the duplicated characters,
but if the word is less than five characters long, print "Too Short."
and if the word is more than five characters long, print "Too long."
        Ex:
            input:
                aabbc

             output:
                 abc
 */