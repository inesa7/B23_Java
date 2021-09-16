package day42_CustomClass_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {
        int[] arr1 = new int[3]; // {0,0,0}
              arr1 = new int[] {1,2,3}; // {1,2,3}

        System.out.println(Arrays.asList(arr1));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
                new ArrayList<>(Arrays.asList("D", "E", "F"));
    }
}
