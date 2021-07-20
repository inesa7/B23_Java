package day17_StringMethods;

import java.util.Locale;

public class contains_Method {
    public static void main(String[] args) {

        String sentence = "My favorite programming languages are; C#, Java and Javascript";
        boolean hasPython = sentence.contains("Python");
        boolean hasJava = sentence.contains("Java");

        //to ignore case sensitivity
        boolean hasJava2 = sentence.toLowerCase().contains("Java");

        System.out.println("hasPython = " + hasPython);
        System.out.println("hasJava = " + hasJava);

    }
}
