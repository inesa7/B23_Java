package day29_ReturnMethods;

import java.util.Arrays;

public class MergeTwoArrays_VoidMethod {
    public static void main(String[] args) {

        //    create a function that can print out the combination of two integer arrays
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        MergeTwoArrays(arr1,arr2);

    }

    public static void MergeTwoArrays(int[] arr1, int[]arr2){
        int[] arr3 = new int[arr1.length+ arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i++]= each;
        }

        for (int each : arr2) {
            arr3[i++]= each;
        }
        System.out.println(Arrays.toString(arr3));
    }

}
