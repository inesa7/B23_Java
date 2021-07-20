package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {
        // 2 dimensional array: MUST contain 1 dimensional array

        //index of elements:0,1,2   0,1    0,1,2
        int[][] arr2D = { {1,2,3}, {4,5}, {6,7,8} }; // this 2 dimensional array has 3 arrays but index 2(0,1,2)
        //index of array:    0,       1,      2

        System.out.println(arr2D.length); // size of this array is 3

        // to print out entire 2D array - Arrays.deepToString(arr2D):

        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5], [6, 7, 8]]

        // to retrieve array1- {4,5}:

        System.out.println(Arrays.toString(arr2D[1] )); //[4, 5]

        // to retrieve elements:
        System.out.println(arr2D[1][1]); //5

        //to print out each
        for (int i = 0; i < arr2D.length; i++) { // i: index numbers of single dimens arrays
            int[] each1DArray = arr2D[i]; // retrieve each of single dimens array
            System.out.println(Arrays.toString(each1DArray)); // [1, 2, 3] [4, 5] [6, 7, 8]

            for (int j = 0; j < each1DArray.length; j++) { // j: index numbers of elements inside each single dimens arrays
                System.out.println(each1DArray[j]); // elements 6,7,8
            }
        }
        System.out.println("-----------------------------------------");
        for ( int[] each1D : arr2D) {
            System.out.println(Arrays.toString(each1D)); // each of single dim arr [1, 2, 3] [4, 5] [6, 7, 8]


        for( int element : each1D ){
            System.out.println(element);}
        }
        System.out.println(); // append new line after printing each elements of array in one line
        // 1,2,3  4,5  6,7,8

    }
}
