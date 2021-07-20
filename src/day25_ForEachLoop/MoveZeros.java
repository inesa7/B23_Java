package day25_ForEachLoop;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};

        int[] result = new int[array.length];
        // {10, 5, 1, 0, 0}

            // 1. using for each loop:

        int i = 0; // index number of the result
        for (int each : array) { // 10, 0, 5, 0, 1, 0
            if(each != 0){
                result[i] = each;
                i++;
            }
        }


        System.out.println(Arrays.toString(result));

        //2. using for loop:
        /*

        for (int i = 0; j=0; i < array.length; i++) {
            if(array[i] != 0 ){
                result[j] = array[i];
                j++;
            }
        }
        */


    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                {10, 5, 1, 0, 0, 0}
      MUST use for each loop
 */