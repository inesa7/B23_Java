package day25_ForEachLoop;

import java.util.Arrays;

public class ForEachIntro {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        // index:        0,1,2,3,4

        /*
        regular loop:

        for (int i = 0; i < numbers.length; i++) { // i: index numbers of the array
            System.out.println(numbers[i]);
        }
         */

        for(int each : numbers){ // each represents the elements
            System.out.println(each);
        }

        System.out.println("----------------------------");

        String[] names = {"Sarah", "Bob", "Joe", "Rob", "Mary"};
        for( String eachName: names ){ // there is no index in for each loop
            System.out.println(eachName);
        }
        Arrays.sort(names);
    }
}
