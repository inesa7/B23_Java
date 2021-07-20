package day04_Variables;

import java.sql.SQLOutput;

public class ConcatenationPractice {

    public static void main(String[] args) {
        /*
        + addition: when we have two numbers
        10 + 10 = 20
        + concatenation: when there is at least one string
        "10" + "10" = "1010"
        1 + "10" = "110"
        "2" + 3 = "23"

         */
        String word = "Java";
        System.out.println("My favorite language is " + word + " programming language");
        System.out.println("--------------------");

        int dollar = 100;
        double lira = dollar * 8.41;
        double euro = dollar * 0.88;

        System.out.println(dollar+" US dollars equal to "+ lira+" Turkish lira");
        System.out.println(dollar+" US dollars equal to "+ euro+" Euro");

        System.out.println("--------------------");

        int a = 100;
        int b = 200;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;

        System.out.println(a + b);
        System.out.println(a - b);
        //10 + 20 = 30
        System.out.println(a + " + " + b + " = " + addition);

        //10 - 20 = -10
        System.out.println(a + " - " + b + " = " + subtraction);

        //100 * 200 = 2000
        System.out.println(a + " * " + b + " = " + multiplication);

        System.out.println("-------------------------------------");
        String name = "Inesa";
        String favoriteMusic = "Rock Music";
        String favoriteBook = "Murakami";
        String favoriteMovie = "Gone with the wind";

        System.out.println("My name is " + name + ", my favorite music is \"" + favoriteMusic
                        +"\", my favorite book is \"" + favoriteBook +
                "\", my favorite movie is \""+favoriteMovie+"\"");

        String today = "Monday";
        String todaysClass = "Java";
        String tomorrow = "Tuesday";
        String tomorrowClass = "Selenium";
        System.out.println("Today is "+today + ", today we have " + todaysClass+" class"+
                            ", tomorrow is "+tomorrow +", tomorrow we have "+tomorrowClass+" class.");






    }
}
