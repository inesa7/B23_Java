package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,10,10,5,0,-1,30,40,50));


        Collections.sort(list); // to sort in ascending order
        System.out.println(list); // [-1, 0, 5, 10, 10, 30, 40, 50]

        Collections.reverse(list); // to sort in descending order
        System.out.println(list); // [50, 40, 30, 10, 10, 5, 0, -1]

        // to swap elements 1 and 3 (indexes are 1 and 2)
        Collections.swap(list, 0,2);
        System.out.println(list); // [30, 40, 50, 10, 10, 5, 0, -1]

        // to replace all 10s by 20s
        Collections.replaceAll(list, 10, 20);
        System.out.println(list); // [30, 40, 50, 20, 20, 5, 0, -1]

        // to find out frequency of 20s
        int f = Collections.frequency(list, 20);
        System.out.println(f);

        // to find unique elements from chars
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B','C','D','C', 'C'));

        ArrayList<Character> unique = new ArrayList<>(chars);
        unique.removeIf(p-> Collections.frequency(unique, p) !=1);
        System.out.println(unique); // [A, B, D]

        /*
        using utility method frequency of chars

        for (Character each : chars) {
            if(Collections.frequency(chars, each) == 1){
                unique.add(each);
            }
        }
        System.out.println(unique); // [A, B, D]
        */

        //  to find unique elements from the string
        String str = "ABABAACCDE";
        String uniques = "";

        ArrayList<String> result = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(result); // [A, B, A, B, A, A, C, C, D, E] we split into array

        for(String each : result){
            if(Collections.frequency(result, each)==1){
                uniques+=each;
            }
        }

        System.out.println(uniques); // DE

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("min = " + min); // min = -1
        System.out.println("max = " + max); // max = 50

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20, 5,0,30,40,50));

        numbers.removeIf(p-> p == Collections.max(numbers));
        System.out.println(numbers); // [10, 20, 5, 0, 30, 40] removed 50
        int firstMax=Collections.max(numbers);





    }
}
