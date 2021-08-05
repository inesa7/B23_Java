package day36;

import java.util.*;

public class Replit_AppearsTwice {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String target = "laptop";
        String sentence = "I would like to buy a new laptop, because my laptop is too old.";


        String[] sentence1 = sentence.split(" ");

        ArrayList<String> array = new ArrayList<>(Arrays.asList(sentence1));

        boolean appearsTwice = true;

        int frequency = 0;
        for (String each : array) {

            if (each.equals(target)) {
                frequency++;
            } else if (each.equals(target + ",")) {
                frequency++;
            }
        }

        if (frequency > 1) {
            appearsTwice = true;
        } else {
            appearsTwice = false;
        }


        System.out.println(appearsTwice);

    }
}

    /*
    // option 2 with method:

     public class AppearsTwice {
        public static void main(String[] args) {
            System.out.println("Hello world!");
    }

    public static boolean appearsTwice(String target, String sentence) {

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
     */

/*
Write a a method appearsTwice() that returns true if value of variable target appears
only twice in the string sentence, otherwise return false.
`Examples:`
`Examples:`
`Main.appearsTwice("java", "java is fun!")`
`Main.appearsTwice("java", "java is fun!")`
      `- returns false, because java appears only once.`
      `- returns false, because java appears only once.`
`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`
`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`
      `- returns true, because laptop appears twice.`
 */