package Day12_Scanner;

import java.util.Scanner;

public class NameOfMonths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.err.println("Invalid month");

        }
    }
}
/*
        String name = "";

        if(number>=1 && number<=12){
         name = (number == 1)? "January" :(number == 2)? "February" :(number == 3)? "March" :(number == 4)? "April"
                :(number == 5)? "May" :(number == 6)? "June" :(number == 7)? "July" :(number == 8)? "August":
                (number == 9)? "September" :(number == 10)? "October" :(number == 11)? "November" :"December";
        }else{
            name = "Invalid";
            System.out.println(name);

         */