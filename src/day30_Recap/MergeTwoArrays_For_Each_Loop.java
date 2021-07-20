package day30_Recap;

import java.util.Arrays;

public class MergeTwoArrays_For_Each_Loop {

    public static void main(String[] args) {

        int[] numbers = {100,200,300,400,500};

        for( int each : numbers){ // int each - is elements of the array
            System.out.print(each+" "); // 100 200 300 400 500
        }

        System.out.println("----------------------------------------");

        // find max num
        int max = numbers[0];

        for( int number : numbers){ // number represents each number of the array
//            if(number >  max){
//                max = number;
//            }

            max = Math.max(number, max); // Math method returns the max number btw 2 numbers

            }

        System.out.println(max);

        System.out.println("----------------------------------------");

        // merge 2 arrays
        String[] group1 = {"Sophie", "Feruza", "Ekaterina"};
        String[] group2 = {"Shazia", "Bilguun", "Danka", "Mucahit"};

        //new array
        String[] group3 = new String[group1.length + group2.length]; //i

        int i = 0;
        for (String name : group1) {
            group3[i++]= name;
        }

        for (String name : group2) {
            group3[i++]= name;
        }

        System.out.println(Arrays.toString(group3));

        }


    }

