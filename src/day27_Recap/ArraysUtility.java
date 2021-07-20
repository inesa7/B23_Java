package day27_Recap;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] number = Arrays.copyOf(nums,5); // {1,2,3,0,0}

        System.out.println(Arrays.toString(number));

        System.out.println("----------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};
        int[] arr3 = new int[arr1.length+ arr2.length];

        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOf(arr1, arr1.length+ arr2.length );
        System.out.println(Arrays.toString(arr4));

        int i = arr1.length;
        for(int each : arr2){
            arr3[i++] = each;
        }


    }
}
