package day35_ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
            i++;
        }

        // Write your code below

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(list.size());
        System.out.println(list);

    }
}
