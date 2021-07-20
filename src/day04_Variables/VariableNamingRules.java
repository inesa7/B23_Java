package day04_Variables;

import java.sql.SQLOutput;

/*
1. must be unique
2. starts with letters
3. no special characters other than _ and $
4.can not be java reserved words
5. camelCase
 */
public class VariableNamingRules {

    public static void main(String[] args) {

        int age = 40;

        String sentence = "My age is: " +age;
        System.out.println(sentence);

        //My age is: 21
        System.out.println("12"+1); //concatenation: 121
        System.out.println(12+1); //addition: 13
    }
}
