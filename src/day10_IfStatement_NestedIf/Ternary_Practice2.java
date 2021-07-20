package day10_IfStatement_NestedIf;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int number = 100;

        String result = (number >0)? "Positive" : (number < 0)? "Negative" : "Zero";

        System.out.println("-------------------------------------------------");

        int score = 100;
        char grade = (score>=90) ? 'A' :(score>=80)? 'B':(score>=70)?'C':(score>=60)?'D':'F';

        }
        }



