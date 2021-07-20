package day25_ForEachLoop;

public class MergeThreeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,11},
                arr2 = {4,5,6},
                arr3 = {7,8,9,12,12,14};

        int[] arr4 = new int[arr1.length+ arr2.length+ arr3.length];

        for (int i = 0; i < arr1.length; i++) {
            arr4[i+ arr1.length]=arr1[i];
        }


        for (int i = 0; i < arr1.length; i++) {
            arr4[i+i+ arr1.length]=arr2[i];
        }


    }
}
