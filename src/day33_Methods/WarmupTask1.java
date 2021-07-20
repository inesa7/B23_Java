package day33_Methods;

import java.util.Arrays;

public class WarmupTask1 {

    public static void main(String[] args) {

        String[] students={"Inna", "Tom", "Jack"};
        students = reverse(students);
        System.out.println(Arrays.toString(students)); //[Jack, Tom, Inna]

        int[] numbers = {1,2,3,4,5,6};
        numbers=reverse(numbers);
        System.out.println(Arrays.toString(numbers)); //[6, 5, 4, 3, 2, 1]

        char[] chars = {'A', 'B', 'C', 'D'};
        chars=reverse(chars);

    }

    //1. create a method that can reverse an array of integer
    public static int[] reverse(int[] array){ //{1,2,3,4,5} ==> {5,4,3,2,1}, int i= from last index to 0

        int[] result = new int[array.length]; // new array {0,0,0,0,0} int j =  from 0 to last index

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    //2. create a method that can reverse an array of String
    public static String [] reverse(String[] array){ //{1,2,3,4,5} ==> {5,4,3,2,1}, int i= from last index to 0

        String[] result = new String[array.length]; // new array {0,0,0,0,0} int j =  from 0 to last index

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

    //3. create a method that can reverse an array of double
    public static double[] reverse(double[] array){ //{1,2,3,4,5} ==> {5,4,3,2,1}, int i= from last index to 0

        double[] result = new double [array.length]; // new array {0,0,0,0,0} int j =  from 0 to last index

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }


    //4. create a method that can reverse an array of char
    public static char [] reverse(char[] array){ //{1,2,3,4,5} ==> {5,4,3,2,1}, int i= from last index to 0

        char[] result = new char [array.length]; // new array {0,0,0,0,0} int j =  from 0 to last index

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            result[j]=array[i];
        }
        return result;
    }

}
/*
        1. create a method that can reverse an array of integer

		2. create a method that can reverse an array of double

		3. create a method that can reverse an array of String

		4. create a method that can reverse an array of char
 */