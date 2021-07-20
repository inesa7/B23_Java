package day32_MethodOverloading;

import java.util.Arrays;

public class WarmupTask2 {
    public static void main(String[] args) {

        // example with integers
        int[] array={1,2,3,4,5,6,7,8,9};
        int element = 10;

        array = addInteger(array, element); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(array));

        array = addInteger(array, 11);
        System.out.println(Arrays.toString(array)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]


        System.out.println("----------------------------------------------------");
        // example with double numbers

        double[] array2={2.5, 3.5};
        array2= addDouble(array2, 4.5);
        System.out.println(Arrays.toString(array2)); // [2.5, 3.5, 4.5]

        array2=addDouble(array2, 5.5);
        System.out.println(Arrays.toString(array2)); // [2.5, 3.5, 4.5, 5.5]

        System.out.println("-----------------------------------------------------");
        // example with String

        String[] group1 = {"Tom","Jack","Nick"};
        String student = "Peter";

        group1= addString(group1, student);
        System.out.println(Arrays.toString(group1)); //[Tom, Jack, Nick, Peter]

        System.out.println("-----------------------------------------------------");
        // example with char

        char[] array3={'A', 'B', 'C'};
        array3 = addChar(array3, 'C');
        System.out.println(Arrays.toString(array3));

        //---------------------------------method overloading----------------------------------------

        int[] arr1 = {1,2,3,4,5,6,7};
        arr1=addInteger(arr1, 8);
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 4, 5, 6, 7, 8]

        double[] arr2 = {10.5, 3.5, 4.5};
        arr2=addDouble(arr2, 9.5);
        System.out.println(Arrays.toString(arr2)); // [10.5, 3.5, 4.5, 9.5]

        String[] items = {"milk","bread","rice"};
        items=addString(items, "apples");
        System.out.println(Arrays.toString(items)); // [milk, bread, rice, apples]

        char[] array4={'A', 'B', 'C'};
        array4= addChar(array4, 'D');
        System.out.println(Arrays.toString(array4)); // [A, B, C, D]




    }

        public static int[] addInteger(int[] array, int number){
        /*
        int[] result = new int[array.length+1];
        int i = 0;

        for (int each : array) {
            result[i++]=each;
        }

        result[i]=number;
        */

        int[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = number;
        return result;
    }

        public static double[] addDouble(double[] array, double number){
        double [] result = Arrays.copyOf(array, array.length+1); // this is the new array with one more element added
        result[result.length-1] = number;

        return result;

        }

        public static String[] addString(String[] array, String str){
            String [] result = Arrays.copyOf(array, array.length+1); // new array with the last index of a String array
            result[result.length-1]=str;

            return result;

        }

        public static char[] addChar(char[] array, char ch){
        char [] result = Arrays.copyOf(array, array.length+1); // new array with the last index of a char array
        result[result.length-1]=ch;

        return result;

    }


    //---------------------------------method overloading----------------------------------------

    public static int[] addElement(int[] array, int number){
        /*
        int[] result = new int[array.length+1];
        int i = 0;

        for (int each : array) {
            result[i++]=each;
        }

        result[i]=number;
        */

        int[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = number;
        return result;
    }

    public static double[] addElement(double[] array, double number){
        double [] result = Arrays.copyOf(array, array.length+1); // this is the new array with one more element added
        result[result.length-1] = number;

        return result;

    }

    public static String[] addElement(String[] array, String str){
        String [] result = Arrays.copyOf(array, array.length+1); // new array with the last index of a String array
        result[result.length-1]=str;

        return result;

    }

    public static char[] addElement(char[] array, char ch){
        char [] result = Arrays.copyOf(array, array.length+1); // new array with the last index of a char array
        result[result.length-1]=ch;

        return result;

    }

    public static int max(int[] array){
        int max = array[0];

        for(int each : array){
            max= Math.max(each, max);
        }

        return max;
    }

    }




/*
Task2:
    1. create a return method called addInteger that can add an Integer number after the  last index of an integer array

    2. create a return method called addDouble that can add a double number after the last index of a double array

    3. create a return method called addString that can add a String after the last index of a String array

    4. create a return method called addChar that can add a char after last index of a char array
 */