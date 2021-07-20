package day31_Recap;

public class MinNumberArray {
    // return the min number from array of integer
    public static int minNumber(int[] numbers) {

        int min = numbers[0];

        for (int each : numbers) {

            min = Math.min(each, min);
        }

        return min;
    }


//    public static int[] addElement(int[] arr, int num) { // {1,2,3}, int 4
//        int[] array = new int[arr.length + 1];
//        for (int i = 0, j = 0; i < arr.length; i++, j++) {
//            array[j] = arr[i];
//        }
//
//        array[array.length - 1] = num;
//
//        return array;
}
