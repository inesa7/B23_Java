package day34_LocalDateTimeWrapper;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now); // 10:59:46.150

        LocalTime breakTime = now.plusMinutes(15); // 11:02:56.343
        System.out.println(breakTime); // 11:17:56.343

        LocalTime quizDue = breakTime.plusMinutes(20);
        System.out.println(quizDue); // 11:39:12.684
    }
}
