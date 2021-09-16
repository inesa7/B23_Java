package day39_CustomClass_Statics.Tester;

import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester[] testers = {new Tester(), new Tester(), new Tester(), new Tester() };

        testers[0].setInfo("Elena", "SDET", 78, 100000);
        testers[1].setInfo("Mohammed", "SDET", 123, 90000);
        testers[2].setInfo("Aysu", "SDET", 34, 110000);
        testers[3].setInfo("Ella", "SDET", 56, 115000);

        Developer[] developers = {new Developer(), new Developer(), new Developer() };

        developers[0].setInfo("Suat", "Developer", 45, 120000);
        developers[1].setInfo("Tin", "Developer", 68, 120000);
        developers[2].setInfo("Esra", "Developer", 87, 130000);

        ScrumTeam scrumTeam = new ScrumTeam();

        scrumTeam.setInfo("Suat", "Philipp", "Aysu");

        scrumTeam.testersList.addAll(Arrays.asList(testers));
        scrumTeam.devopsList.addAll(Arrays.asList(developers));


        scrumTeam.removeDeveloper(45);
        //System.out.println(Arrays.toString(scrumTeam));


    }
}
/*
create a class called MyScrumTeam:
                    1. create an array of Testers and add the testers from your group
                    2. create an array of developers add the developers from your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */