package day30_Recap;

import java.util.Arrays;

public class ArraysReview {

    public static void main(String[] args) {

        String [] items = new String[5]; // [null, null, null, null, null] if the size of the array is not known, we just know it  contains 5 elements(items) with default values null 0
        System.out.println(Arrays.toString(items)); // will print out null 0

        // to assign elements to indexes:

        items[0] = "table";
        items[1] = "chair";
        items[2] = "pen";
        items[3] = "pencil";
        items[4] = "paper";
        // items[5] = "milk"; // out of boundaries because there is no index 5

        System.out.println(Arrays.toString(items)); // [table, chair, pen, null, null]

        int[] numbers = {1,2,3,4,5,6,7,8,9,10}; // when we know exact elements
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

        for (int i = 0; i < numbers.length-1; i++) { // i: index nums of array
            System.out.print(numbers[i]); // 123456789
        }

        System.out.println("---------------------------------------");

        // reverse the elements and merge arrays

        int[] nums = {10,20,30,40,50};
        int [] result = new int[nums.length];

        for (int i = nums.length-1, j=0; i >0 ; i--, j++) { // 50,40,30,20,10
            result[j]=nums[i];
        }
        System.out.println(Arrays.toString(result)); // [50, 40, 30, 20, 0

        System.out.println("---------------------------------------");

        // merging 2 arrays

        String[] group1 = {"Sophie", "Feruza", "Ekaterina"};         // i
        String[] group2 = {"Shazia", "Bilguun", "Danka", "Mucahit"}; //j

        //new array
        String[] group3 = new String[group1.length + group2.length]; //k

        int k = 0;
        for(int i = 0; i <= group1.length-1; i++ , k++){ // first array
            group3[k] = group1[i]; // getting elements from array 1 and assigning them to indexes of array 3
        }

        for(int j = 0; j <= group2.length-1; j++, k++){
            group3[k] = group2[j]; // getting elements from array 2 and assigning them to indexes of array 3
        }


        System.out.println( Arrays.toString(group3)); // [Sophie, Feruza, Ekaterina, Shazia, Bilguun, Danka, Mucahit]


    }
}
