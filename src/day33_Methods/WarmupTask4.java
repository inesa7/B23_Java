package day33_Methods;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmupTask4 {

    public static void main(String[] args) {

        String str="aabbccc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains(""+each)){
                result+=each;
            }
        }

        System.out.println(result);


        System.out.println("----------------------------------------------");

        int[] array = {1,1,1,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5}; //{1,2,3,4,5}
        int[] newArr={}; // empty array

        for (int each : array) {
            if(!ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each);
            }

        }

        System.out.println(Arrays.toString(newArr)); //[1, 2, 3, 4, 5]

        System.out.println("----------------------------------------------------");

        int[] numbers = {1,1,1,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5};
        int[] r1=removeDuplicates(numbers);
        System.out.println(Arrays.toString(r1));


        System.out.println("----------------------------------------------------");

        String[] names = {"Nick", "Jack", "Nick", "Tom", "Tom", "Pete"};
        names = removeDuplicates(names);
        System.out.println(Arrays.toString(names));




    }

    //method that can remove the duplicates from an array of integer
    public static int[] removeDuplicates(int[] array){
        int[] newArr={}; // empty array

        for (int each : array) {
            if(!ArraysUtility.contains(newArr, each)){ // if element is not contained in newArr
                newArr = ArraysUtility.addElement(newArr, each); //then add element to the array
            }

        }

        return newArr;
    }


    //method that can remove the duplicates from an array of double
    public static double[] removeDuplicates(double[] array){
        double[] newArr={}; // empty array

        for (double each : array) {
            if(!ArraysUtility.contains(newArr, each)){ // if element is not contained in newArr
                newArr = ArraysUtility.addElement(newArr, each); //then add element to the array
            }

        }

        return newArr;
    }


    //method that can remove the duplicates from an array of String
    public static String[] removeDuplicates(String[] array){
        String[] newArr={}; // empty array

        for (String each : array) {
            if(!ArraysUtility.contains(newArr, each)){ // if element is not contained in newArr
                newArr = ArraysUtility.addElement(newArr, each); //then add element to the array
            }

        }

        return newArr;
    }


    //method that can remove the duplicates from an array of char
    public static char[] removeDuplicates(char[] array){
        char[] newArr={}; // empty array

        for (char each : array) {
            if(!ArraysUtility.contains(newArr, each)){ // if element is not contained in newArr
                newArr = ArraysUtility.addElement(newArr, each); //then add element to the array
            }

        }

        return newArr;
    }


    
    


}
/*
1. create a method that can remove the duplicates from an array of integer
	        Ex:
	          int[] array = {1,1,1,2,2,2,3,4,5,5,5};
	          removeDup(array);  ===> {1,2,3,4,5}

	    2. create a method that can remove the duplicates from an array of double

	    3. create a method that can remove the duplicates from an array of String

	    4. create a method that can remove the duplicates from an array of char

	        HINT: how did you remove the duplicates from a string?
 */