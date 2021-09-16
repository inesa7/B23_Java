package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        // array:
        int[] nums = new int[10]; // this array, size is fixed: 10 elements
        System.out.println(Arrays.toString(nums)); // to print out array
        System.out.println(nums[2]); //to print out element 2 of the array

        //ArrayList:


        ArrayList<String> list = new ArrayList<>(); // this is ArrayList size is 0
        list.add("Apple"); // index 0: Apple
        list.add("Orange"); // index 1: Orange
        list.add("Pear"); // index 2: Pear
        list.add(1, "Banana"); // add Banana to index 1, Orange will shift to the right
        System.out.println(list); //[Apple, Banana, Orange, Pear]
        System.out.println(list.get(2)); // Orange

        ArrayList<Integer> numbers = new ArrayList<>(); // this is ArrayList size is 0
        numbers.add(10); // autoboxing, 0
        numbers.add(20); // autoboxing, 1
        numbers.add(30); // autoboxing, 2
        numbers.add(40); // autoboxing, 3
        numbers.add(50); // autoboxing, 4
        numbers.add(1, 15); // to add element 15 to index 1, autoboxing [10, 15, 20, 30, 40]

        System.out.println(numbers); // to print out ArrayList
        System.out.println(numbers.get(2)); // to print out element 2 of the ArrayList 30
        // if there are 5 elements in ArrayList, you cannot print out elements more than 5 because they are not assigned

        System.out.println(numbers.size()); // prints total number of elements in ArrayList

        // get() method - used to retrieve elements for ArrayList

        for (int i = 0; i <  numbers.size(); i++) { // use loop to retrieve every single element of the ArrayList
            System.out.println(numbers.get(i)); // get() method
        }

        for ( int each : numbers) { // for each loop can also be used to retrieve every single element of the ArrayList
            System.out.println(each);

        }

    }
}
