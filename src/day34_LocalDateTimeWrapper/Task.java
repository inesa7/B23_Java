package day34_LocalDateTimeWrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {

        String[] students = {"Lena", "Marina", "Aysu", "Inna", "Elya"};

        LocalDate[] DOB = { LocalDate.of(1978, 5,25),
                            LocalDate.of(1980, 3,4),
                            LocalDate.of(1995, 12,30),
                            LocalDate.of(1978, 4,12),
                            LocalDate.of(1979, 4,25) };

        LocalDate youngestPerson = DOB[0];
        int index = 0; // index number of the youngest person

        for (int i = 0; i < students.length; i++) {
            if(DOB[i].isAfter(youngestPerson)){
                youngestPerson=DOB[i]; // youngest person DOB
                index = i;
            }

            if(DOB[i].isLeapYear()){
                System.out.println(students[index]);
            }
        }

        System.out.println("youngestPerson = " + youngestPerson); // youngestPerson = 1995-12-30
        System.out.println(students[index]); //Aysu


        System.out.println("---------------------------------------------------------");

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]+" was born on "+DOB[i].format(DF));

        }




    }

}
/*
Task:
    1. create string array to have 5 of your classmate's names
    2. create an array that contains their DofB
    3. find out who is the youngest person
    4. find out who was born on leap year
 */