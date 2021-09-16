package day34_LocalDateTimeWrapper;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {
        birthday(1989, 7, 22); // Happy Birthday! Today you are 32 years old
        birthday(2020, 8, 15); // Today is not your birthday


    }
    public static void birthday(int year, int month, int date){
        LocalDate DOB = LocalDate.of(year, month, date);
        LocalDate today = LocalDate.now();
        int age = today.getYear() - DOB.getYear();

        if(DOB.getMonthValue() == today.getMonthValue()  && DOB.getDayOfMonth() == today.getDayOfMonth()) {
            System.out.println("Happy Birthday!");
            System.out.println("Today you are " + age + " years old.");
        }else{
            System.out.println("Today is not your birthday.");
            }

        }
    }

