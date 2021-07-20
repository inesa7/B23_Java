package Tasks;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {

        //char[] str = str.toCharArray(); //"aaabbcccc"

        String removeDup = ""; //"abc"
        String result = "";


        //remove duplicates
        for (int j = 0; j < str.length(); j++) {
            char each = str.charAt(j); //"aaabbcccc"
            if (!removeDup.contains("" + each)) {
                removeDup += each; //"abc"
            }
        }


        for (char each : removeDup.toCharArray()) { //abc

            //frequency of characters
            int frequency = 0;
            for (char each1 : str.toCharArray()) { //"aaabbcccc"
                if (each == each1) {
                    frequency++;
                }
            }
            result += frequency + ""+each;
        }
        return result;
    }
}