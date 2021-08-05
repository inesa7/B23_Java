package day37_CustomClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp {
    public static void main(String[] args) {

        String [] names = {"Tom", "Jerry", "Nick", "Mike"};

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList(names)); // to add String array names to arrayList

        System.out.println(students); // [Tom, Jerry, Nick, Mike]

        // Task 1: swap the first and last elements of an ArrayList
        Collections.swap(students, 0, students.size()-1); // swap the first and last elements of an ArrayList
        System.out.println(students); // [Mike, Jerry, Nick, Tom]

        System.out.println("---------------------------------------------------------");

        // Task2: return the first unique elements of an ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,4,5,5,6,6,7,8,8,9,0));

        ArrayList<Integer> uniques = new ArrayList<>(list);
        System.out.println(uniques); // 1,1,1,2,2,2,3,4,5,5,6,6,7,8,8,9,0
        uniques.removeIf(p -> Collections.frequency(uniques, p) !=1); // remove if the element is not unique
        int firstUniqueElement = uniques.get(0);
        System.out.println(uniques); // 3

        int firstUnique = 0;
        for (Integer each : list) {
            if(Collections.frequency(list, each) == 1){
                firstUnique = each;
                break;
            }
        }

        System.out.println(firstUnique); // 3

        System.out.println("---------------------------------------------------------");

        // Task3: find the frequency of character from a String, DO NOT use nested loop

        String str = "AABBCCDDEE";
        String result = ""; // end result A2B2C2D2E2

        str.split(""); // to convert String into array
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str.split(""))); // to add array into arrayList
        Arrays.asList(str.split(""));
        System.out.println(list2); // [A, A, B, B, C, C, D, D, E, E]

        for(String each : StringUtility.removeDuplicates(str).split("")) { // A,B,C,D,E
            int frequency = Collections.frequency(list2, each); // frequency A-2, B-2, C-2, D-2, E-2
            result+=each + frequency;
        }

        System.out.println(list2);
        System.out.println(result); // A2B2C2D2E2

        System.out.println("---------------------------------------------------------");

        // Task4: return the nth largest number from an ArrayList of integers
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,10));

        ArrayList<Integer> original = new ArrayList<>(numbers);
        
//        Collections.sort(numbers); // asc
//        Collections.reverse(numbers); // desc
        
        //5th maximum number(n-th number):
        int n= 5; // n-th max number
        for (int i = 1; i < n; i++) {
            numbers.removeIf(p-> p == Collections.max(numbers)); // to find 5th max number
        }
        
        int fifthMaxNumber = Collections.max(numbers);
        System.out.println("fifthMaxNumber = " + fifthMaxNumber); // fifthMaxNumber = 6


        
        






    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList

2. write a program that can return the first unique elements of an ArrayList

3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

4. Write a program that can return the n-th largest number from an ArrayList of integers
 */