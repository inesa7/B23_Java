package day31_Recap;

import utilities.ArraysUtility;
import utilities.NumbersUtility;

import java.sql.SQLOutput;
import java.util.Arrays;

public class WarmupTasks3 {

    public static void main(String[] args) {

        System.out.println(NumbersUtility.isOdd(3));
        System.out.println(NumbersUtility.isEven(6));
        System.out.println(NumbersUtility.subtraction(5, 2));
        System.out.println(NumbersUtility.addition(3, 3));
        System.out.println(NumbersUtility.max(10, 8));
        System.out.println(NumbersUtility.min(7, 2));
        System.out.println(NumbersUtility.cube(6));

        int[] arr={1,2,3};
        int num = 4;

        //System.out.println(Arrays.toString(ArraysUtility.addElement(arr, num)));//[1, 2, 3, 4, 5, 6]System.out.println(Arrays.toString(ArraysUtility.addElement(arr, num)));//[1, 2, 3, 4, 5, 6]
        //System.out.println(Arrays.toString(addElement(arr,num)));

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(merge(arr1,arr2)));

    }

    public static int[] addElement(int[] arr, int num){ // {1,2,3}, int 4
        int[] array = new int[arr.length+1];
        for (int i = 0, j=0; i < arr.length; i++, j++) {
            array[j]=arr[i];
        }


        array[array.length-1]=num;

        return array;


    }

    //create a return method named merge that can merger two arrays of integers
    public static int[] merge(int[] arr1, int[] arr2) { // arr1:{1,2,3}, arr2: {4,5,6}

        int[] arr3 = new int[arr1.length + arr2.length]; // arr3: {1,2,3,4,5,6}

        //int j = 0; // loop for arr3

        for (int i = 0, j=0; i < arr1.length; i++, j++) { // i; indexes of arr1 - 1,2,3 // arr1
            //arr3: {1,2,3,0,0,0}
            arr3[j] = arr1[i];

        }
        for (int k = 0, j= arr1.length; k < arr2.length; k++,j++) { // i; indexes of arr2 - 4,5,6 // arr2
            //arr3: {0,0,0,4,5,6}
            arr3[j] = arr2[k];
        }

        return arr3;
    }

}
