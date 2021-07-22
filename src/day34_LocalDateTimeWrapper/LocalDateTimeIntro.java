package day34_LocalDateTimeWrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); //2021-07-22T11:45:17.654

        LocalDate date = LocalDate.of(2021, 8,5);
        LocalTime time = LocalTime.of(17, 45);

        LocalDateTime dateTime = LocalDateTime.of(date, time); // combination
        System.out.println(dateTime); // 2021-08-05T17:45


    }
}
