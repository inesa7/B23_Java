package day40_Custom_Class_Statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlocks {

    public static int a;

    public static ArrayList<String> list = new ArrayList<>();

    static{ // static block to add static variable [A, B, C]
        list.addAll(Arrays.asList("A", "B", "C"));
    }

    public static void main(String[] args) {
        System.out.println(StaticBlocks.list); // [A, B, C]
    }

}
