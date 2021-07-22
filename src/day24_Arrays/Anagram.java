package day24_Arrays;

import java.util.Arrays;

public class Anagram {

    /*
    heart && earth
    race && care
    listen && silent
    output: true
     */

    public static void main(String[] args) {
        String s1 = "race";   //acer
        String s2 = "care";  //acer

        char[] ch1 = s1.toLowerCase().toCharArray();  // [a, c, e, r]
        char[] ch2 = s2.toCharArray();  //  [c, a, r, e]

        Arrays.sort(ch1); // we can use the sort method ==> ch1 will be in ascending order:  a-z
        Arrays.sort(ch2); // we can use the sort method ==> ch2 will be in ascending order: a-z

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram =  Arrays.equals(ch1, ch2);


        System.out.println("isAnagram = " + isAnagram);


    }
}
