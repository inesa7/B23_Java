package day29_ReturnMethods;

public class ReturnMethodsPractice3 {
    public static void main(String[] args) {
        removeDuplicates( "abababcccdaabbca");

    }

    public static String removeDuplicates(String str){
        String result = ""; //"ABC"

        for ( String each: str.split("")) {
            if (!result.contains(each)) {
                result += each;
            }
        }
        System.out.println(result);

        return "";

    }

}
/*
write a method that can remove the duplicates from the string
            "abababa"
            "ab"
 */

// create a function that can check if 2 strings are anagram, return true if the are anagram
//isAnagram("listen", "silent")==> true 2 parameters
//isAnagram("Java", "Python")==> false

