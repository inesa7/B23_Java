package day09_IfStatements;
/*
write a program that can print the name of day based on the number 1 ~ 7
            ex: number = 5;
                output:
                    Friday
 */
public class DaysInWeek {
    public static void main(String[] args) {
        int number = 5;
        String day = "Friday";

        if (number == 1) {
            System.out.println("Monday");
        }
        if (number == 2) {
            System.out.println("Tuesday");
        }
        if (number == 3) {
            System.out.println("Wednesday");
        }
        if (number == 4) {
            System.out.println("Thursday");
        }
        if(number == 5) {
            System.out.println("Friday");

            if (number == 6) {
                System.out.println("Saturday");
            }
            if (number == 7) {
                System.out.println("Sunday");
            }
        }
    }
}
