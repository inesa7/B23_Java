package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class ThreeDimensionalArrays {
    public static void main(String[] args) {

        // int[]
        //int [][] nums = { {1,2,3}, {4,5,6}}; // 2 dimens array length 2

        int [][][] arr3D = {  {{1,2,3}, {4,5}} , {{6,7,8}, {9,10}}  }; // 3 dimens array

        System.out.println(Arrays.deepToString(arr3D)); // to print entire array [[[1, 2, 3], [4, 5]], [[6, 7, 8], [9, 10]]]

        // to print {{6,7,8}, {9,10}}
        System.out.println(Arrays.deepToString(arr3D[1])); //[[6, 7, 8], [9, 10]]

        // to print {4,5}
        System.out.println(Arrays.toString(arr3D[0][1])); //{4,5}

        //8
        System.out.println(arr3D[1][0][2]); //8

        for(int[][] each2D : arr3D){ // for getting each 2 dimens array from arr3D
            for( int[] each1D : each2D){ // for getting 1 dimens array from each 2 dimens array each2D
                for(int element :each1D){  // for getting each element from each single dimens array
                    System.out.print(element+""); // 12345678910
                }
                System.out.println(); // to append new line
            }
        }






    }
}
