package day10_IfStatement_NestedIf;
/*
write a program that can print the name of day based on the number 1 ~ 7
            ex: number = 5;
                output:
                    Friday
 */
public class DaysInWeek {
    public static void main(String[] args) {
        int number = 7; //number is 1~7
        String day = "";

        if (number == 1) {
            day = "Monday";
        } else if (number == 2) {
            day = "Tuesday";
        } else if (number == 3) {
            day = "Wednesday";
        } else if (number == 4) {
            day = "Thursday";
        } else if (number == 5) {
            day = "Friday";
        } else if (number == 6) {
            day = "Saturday";
        } else {
            day = "Sunday";
        }
        System.out.println("day is " + day);

        }
    }



