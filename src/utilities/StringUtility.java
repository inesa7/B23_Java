package utilities;

import java.util.Arrays;

public class StringUtility {

    //this method reverses any given string and returns it
    public static String reverse(String str) { // ABC
        String reverse = ""; //CBA

        for (int i = str.length() - 1; i >= 0; i--) { // i: 2,1,0
            reverse += str.charAt(i);
        }

        return reverse;
    }


    // this method checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str) {
        String reversedStr = reverse(str);
        return str.equalsIgnoreCase(reversedStr);
    }


    // create a method that can remove duplicates from string, returns string
    public static String removeDuplicates(String str) { // removeDup("AAABBBCCCCC")
        String result = ""; //"ABC"

        // char ch - represents each character in the string
        for (char ch : str.toCharArray()) { // we created char array from the string
            if (result.indexOf(ch) < 0) { // if the character is not contained in the result then concat to a result
                // or we can use - !result.contains(ch)
                result += ch;
            }
        }

        return result;
    }


    // checks if two strings are anagram, returns boolean
    public static boolean isAnagram(String str1, String str2) {

        char[] ch1 = str1.toCharArray(); // string converted to char
        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }


    // checks the frequency
    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) { // each: represents each character of str
            if (each == ch) {
                count++;
            }
        }

        return count;
    }


    // unique characters
    public static String uniqueChars(String s) {
        String unique = "";

        for (int i = 0; i <= s.length() - 1; i++) {
            char each = s.charAt(i);
            int frequency = frequency(s, each);
            if (frequency == 1) {
                unique += each;
            }
        }

        return unique;
    }


    //frequencyOfChars("AAABBCCCC") ==> A3B4C2
    public static String frequencyOfChars(String str) {
        String result = ""; //A3B2C4

        for (char each : removeDuplicates(str).toCharArray()) { // each: A, B C
            int frequency = frequency(str, each); // gets the frequency of each character: 3, 2, 4
            result += each; //"ABC"
            result += frequency;//"A3B2C4"
        }

        return result;
    }


    //frequency of the word from the sentence
    public static int frequencyOfWord(String sentence, String word){
        int count = 0;  //3
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while(sentence.contains(word)){
            sentence =  sentence.replaceFirst(word , "");
            count++;
        }

        return count;
    }


}

