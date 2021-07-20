package day23_Arrays;

import java.util.Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        String[] group9 = {"Esra", "Suat", "Aisu", "Ella", "Elena", "Yusuf", "Mohammed", "Tin", "Rmautia"};
                // index:    0        1       2       3       4        5        6          7       8

        // to retrieve data from array:
        /*
        System.out.println(group9[0]); //Esra
        System.out.println(group9[1]); //Suat
        System.out.println(group9[2]); //Aisu
        System.out.println(group9[3]);
        System.out.println(group9[4]);
        System.out.println(group9[5]);
        System.out.println(group9[6]);
        System.out.println(group9[7]);
        System.out.println(group9[8]);

         */

        for (int i = 0; i <=8 ; i++) {  // loop to get all elements of the array
            System.out.println(group9[i]);
        }

        System.out.println(Arrays.toString(group9));
    }

}
