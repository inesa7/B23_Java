package Practice_08_25.cybertek;

import java.time.LocalDate;

public class Cybertek {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Inesa", 'F', LocalDate.of(1978, 4, 12), 1, "SDET", 120000);
        tester1.attendMeeting();
        tester1.drink("coffee");
        tester1.work();

        tester1.eat("pizza");
        tester1.sleep();
        System.out.println("tester " + tester1);


        Developer developer = new Developer("Jack", 'M', LocalDate.of(1956, 6, 23), 2, "Developer", 150000);
        developer.attendMeeting();
        developer.work();
        developer.eat("steak");
        developer.drink("water");
        developer.sleep();
        System.out.println("developer "+ developer);




    }
}
