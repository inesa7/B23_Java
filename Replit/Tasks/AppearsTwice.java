package Tasks;

import java.util.*;

public class AppearsTwice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:



        ArrayList<String> array = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        int freq = 0;
        for (String each : array) {
            if (each.contains(target)) {
                freq++;
            }
        }
        if (freq != 1) {
            return true;
        } else {
            return false;
        }

    }






}

