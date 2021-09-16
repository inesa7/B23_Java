package day40_Custom_Class_Statics.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieObject {

    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.setInfo("Journey to SDET: Cybertek Batch 23", "USA",
                "Adventure, Comedy", "Kuzzat Altay", LocalDate.of(2021, 5, 17));

        movie1.addCast("Asiya"); // to add just one string

        String[] casts = {"Asiya", "Mehmet", "Akbar"};
        movie1.addCast(casts);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Ella", "Elena", "Esra", "Tin"));
        students.addAll(students);

        System.out.println(movie1);
        // Movie{title='Journey to SDET: Cybertek Batch 23', country='USA', genre='Adventure, Comedy',
        // director='Kuzzat Altay', releaseDate=May/17/2021 Monday, casts=4}
    }
}
/*
create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cybertek Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    director: Kuzzat Altay
                    release date: May/17/2021

                    Casts: Asiya, Mehmet, Akbar and 5 more students from your group

            print the full info of the movie
 */