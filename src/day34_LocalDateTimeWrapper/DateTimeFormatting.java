package day34_LocalDateTimeWrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        // DateTimeFormatter.ofPattern("MMMM/dd/YYYY"); MMMM==> July

        LocalDate today = LocalDate.now();
        System.out.println(today); // 2021-07-22

        System.out.println(today.format(DF)); // formatted to 07/22/2021

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); // 12:08:35.356

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(currentTime);
        System.out.println(currentTime.format(DateTimeFormatter.ofPattern("hh:mm")));

        LocalTime time1 = LocalTime.of(17, 25);
        System.out.println(time1);

        System.out.println(time1.format(TF));

        System.out.println("---------------------------------------------");

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY, EEEE hh:mm a"); // July/22/2021, Thursday 12:20 PM


        LocalDateTime a = LocalDateTime.now();
        System.out.println(a); // 2021-07-22T12:16:10.181
        System.out.println(a.format(DTF)); // July/22/2021 12:20 PM


        System.out.println("---------------------------------------------");

        //use the LocalDate & Time get the date and time in the following format: Tuesday, 1:00 pm, Nov/24/2020

        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");
        LocalDateTime time2 = LocalDateTime.of(2020, 11, 24, 13, 0);
        System.out.println(time2.format(format)); // Tuesday, 01:00 PM, Nov/24/2020

        // what day is 2022-01-01

        String result = LocalDate.of(2022, 01, 01).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("result = " + result); // result = Saturday

        System.out.println(nameOfTheDay(2025, 5, 28)); // Wednesday

    }

    // method
    public static String nameOfTheDay(int year, int month, int day) {
        String result = LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern("EEEE"));
        return result;
    }
}

// MM/dd/YYYY  2021-07-22
//