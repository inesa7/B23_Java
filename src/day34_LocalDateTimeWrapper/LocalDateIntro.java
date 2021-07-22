package day34_LocalDateTimeWrapper;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate eid = LocalDate.of(2021, 7, 20);
        System.out.println(eid);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println("---------------------------------------------");

        String[] names = {"Lena", "Marina", "Aysu", "Inna", "Elya"};

        LocalDate[] Dob = { LocalDate.of(1978, 5,25),
                            LocalDate.of(1980, 3,4),
                            LocalDate.of(1995, 12,30),
                            LocalDate.of(1978, 5,25),
                            LocalDate.of(1978, 5,25) };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"'s birthday is: "+Dob[i]);

        }

        System.out.println("---------------------------------------------");

        LocalDate person1 = LocalDate.of(1980,12,11);
        LocalDate person2 = LocalDate.of(1980,12,25);

        if(person1.isBefore(person2)){
            System.out.println("person1 is older");
        }else{
            System.out.println("person2 is older");
        }

        if(person1.isAfter(person2)){
            System.out.println("person1 is younger");
        }else{
            System.out.println("person2 is younger");
        }

        System.out.println("---------------------------------------------");

        boolean r1= person1.isLeapYear();
        System.out.println(r1);

        boolean r2 = LocalDate.of(2023,1,1).isLeapYear();
        System.out.println(r2); //false

        System.out.println("---------------------------------------------");
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); // 2021-07-22 todays date

        LocalDate thirdUnitQuiz = currentDate.plusDays(14);
        System.out.println(thirdUnitQuiz); //2021-08-05

        LocalDate unitAssessment4 = currentDate.plusMonths(1); // 1 month from current date
        System.out.println(unitAssessment4); //2021-08-22

        LocalDate examDate = currentDate.plusWeeks(5); // 5 weeks from current date
        System.out.println(examDate); // 2021-08-26






    }

}
