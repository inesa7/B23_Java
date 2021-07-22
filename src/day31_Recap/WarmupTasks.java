package day31_Recap;

import java.util.Arrays;

public class WarmupTasks {

    public static void main(String[] args) {

        String str = "AAABBBCCCCC";
        System.out.println(removeDuplicates(str));
        String r = removeDuplicates(str);

        System.out.println("--------------------------------");

        String str1 = "heart";
        String str2 = "earth";
        System.out.println(isAnagram(str1,str2));

        System.out.println("--------------------------------");
        String word = "NNNNNNNNNNNNMMMMMMM";
        int n1 = frequency(word, 'M');
        System.out.println("n1 = " + n1);

        System.out.println("--------------------------------");
        String s3 = "AAABBCCCC";  //A3B2C4
        String result ="";

        for( char each : removeDuplicates(s3).toCharArray()){
            int frequency = frequency(s3, each); // frequency of each character
            result += each;
            result +=frequency;
            // or we can write like this: result+=""+ each+frequency; // "" empty string is needed to convert char each to str
        }

        System.out.println(result);

    }

    //remove duplicates
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

    // create a method that can remove duplicates from string, returns string
    public static boolean isAnagram(String str1, String str2) {

        char[] ch1 = str1.trim().toCharArray();
        char[] ch2 = str1.trim().toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }


    // frequency("AAAABB" , 'A') ===> 4
    public static int frequency(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()) { // each: represents each character of str
            if(each == ch){
                count++;
            }
        }

        return count;
    }


    // unique characters
    public static String uniqueChars(String s){
        String unique = "";

        for(int i = 0; i <= s.length()-1; i++){
            char each = s.charAt(i);
            int frequency =  frequency(s, each);
            if(frequency == 1){
                unique += each;
            }
        }

        return unique;
    }

    //frequencyOfChars("AAABBBBCC") ==> A3B4C2
    public static String frequencyOfChars(String str){
        String result = ""; //A3B2C4

        for (char each : removeDuplicates(str).toCharArray()) { // each: A, B C
            int frequency =  frequency(str, each); // gets the frequency of each character: 3, 2, 4
            result += each ; //"ABC"
            result += frequency;//"A3B2C4"
        }

        return result;
    }







}

