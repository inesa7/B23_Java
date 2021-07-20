package day15_String;

import java.util.Locale;

public class substring_Method {
    public static void main(String[] args) {

        String sentence = "Java Programming Language"; // need to print "Java"
        String name = sentence.substring(0, 3+1); // last index is excluded, so 3+1
        System.out.println(name); //Java

        String s2 = "Cybertek School";
        String name2 = s2.substring(0,7+1);
        System.out.println(name2); //Cybertek

        //String name3 = s2.substring(9, 15);
        String name3 = s2.substring(9);
        System.out.println(name3); // "School"

        System.out.println("----------------------");

        String sentence2 = "Java is a programming language";
        String name4 = sentence2.substring(10);
        System.out.println(name4); // "programming language"

        String name5 = sentence2.substring(10,20+1); // or 21
        System.out.println(name5); // "programming"



    }
}
