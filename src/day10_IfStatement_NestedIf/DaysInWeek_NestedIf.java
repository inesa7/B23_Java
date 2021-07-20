package day10_IfStatement_NestedIf;

public class DaysInWeek_NestedIf {
    public static void main(String[] args) {
        int number = 6; //number is 1`7
        String day = "";

        if (number >= 1 && number <= 7) { //pre-condition
            /*
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
            */

            day = (number == 1)? "Monday" :(number == 2)? "Tuesday" :(number == 3) ?"Wednesday"
        :(number == 4)? "Thursday" :(number == 5)? "Friday" :(number == 6)? "Saturday" : "Sunday";
            }else {
            day = "No such day";
            }

            System.out.println(day);
        }

    }

