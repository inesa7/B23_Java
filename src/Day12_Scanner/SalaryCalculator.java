package Day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your hourly rate:");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work in a week:");
        int weeklyHours = input.nextInt();

        System.out.println("How many weeks do you work in a year:");
        int weeks = input.nextInt();

        double salary = hourlyRate*weeklyHours*weeks;

        System.out.println("Your salary is $ "+salary);
    }
}
/*
ask user to enter:
    1. hourlyRate
    2. work hours in a week
    3. work weeks in a year
 */