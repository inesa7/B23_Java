package day29_ReturnMethods;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {


        //descendingOrder(int[] array 1,65,3,7,8,23,46);
    }

    public static void descendingOrder(int[] arr){
        Arrays.sort(arr);
        int[] result = new int[arr.length];

        for (int i = arr.length-1, j=0; i <= 0; i--, j++) {
            result[j] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
//create a function that can print out the array of integers in descending order