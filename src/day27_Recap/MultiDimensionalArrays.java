package day27_Recap;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        String[] scrum1={"Tom", "Jerry", "Anna"};
        String[] scrum2={"Suat", "Ella", "Inna"};
        String[] scrum3={"Tin", "Elena"};

        String[][] scrumTeams = {scrum1, scrum2, scrum3}; // length: 3
        //                          0       1       2

        System.out.println(Arrays.deepToString(scrumTeams)); // to print all names form all teams

        // to get each name from  scrum1 team "Tom", "Jerry", "Anna"

        System.out.println(Arrays.toString(scrumTeams[0]));


    }
}
