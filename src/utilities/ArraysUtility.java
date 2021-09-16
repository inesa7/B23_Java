package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // 1.return the max number from array of integer
    public static int maxNumber(int[] numbers) {

        int max = numbers[0];

        for (int each : numbers) {

            max = Math.max(each, max);
        }

        return max;

    }

    // 2.return the min number from array of integer
    public static int minNumber(int[] numbers) {

        int min = numbers[0];

        for (int each : numbers) {

            min = Math.min(each, min);
        }

        return min;
    }


    // 3.return method that can add an Integer  after the  last index of an integer array
    public static int[] addElement(int[] array, int number) {
        /*
        int[] result = new int[array.length+1];
        int i = 0;

        for (int each : array) {
            result[i++]=each;
        }

        result[i]=number;
        */

        int[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = number;
        return result;
    }
    //4
    public static double[] addElement(double[] array, double number) {
        double[] result = Arrays.copyOf(array, array.length + 1); // this is the new array with one more element added
        result[result.length - 1] = number;

        return result;

    }

    //5
    public static String[] addElement(String[] array, String str) {
        String[] result = Arrays.copyOf(array, array.length + 1); // new array with the last index of a String array
        result[result.length - 1] = str;

        return result;

    }

    //6
    public static char[] addElement(char[] array, char ch) {
        char[] result = Arrays.copyOf(array, array.length + 1); // new array with the last index of a char array
        result[result.length - 1] = ch;

        return result;

    }

    //7. returns max number from array of integers
    public static int max(int[] array) {
        int max = array[0];

        for (int each : array) {
            max = Math.max(each, max);
        }

        return max;
    }

    //8. returns min number from array of integers
    public static int min(int[] array) {
        int min = array[0];

        for (int each : array) {
            min = Math.max(each, min);
        }

        return min;
    }

    //9. returns max number from array of double
    public static double max(double[] array) {
        double max = array[0];

        for (double each : array) {
            max = Math.max(each, max);
        }

        return max;
    }

    //10. returns min number from array of double
    public static double min(double[] array) {
        double min = array[0];

        for (double each : array) {
            min = Math.max(each, min);
        }

        return min;
    }

    // 11. merge two arrays of int
    public static int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (int each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (int each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }

    // 12.merge two arrays of double
    public static double[] merge(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (double each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (double each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // 13.merge two arrays of String
    public static String[] merge(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (String each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (String each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // 14.merge two arrays of char
    public static char[] merge(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (char each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (char each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // 15. remove the element at given index of the array
    public static int[] remove(int[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        int[] result = new int[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // moves all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // 16.remove the element at given index of the array
    public static double[] remove(double[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        double[] result = new double[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // 17. remove the element at given index of the array
    public static String[] remove(String[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        String[] result = new String[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // 18. remove the element at given index of the array
    public static char[] remove(char[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        char[] result = new char[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    //19. reverses the given integer array
    public static int[] reverse (int[] array){
        int[] result = new int[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }


    //20. reverses the given double array
    public static double[] reverse (double[] array){
        double[] result = new double[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }


    //21. reverses the given String array
    public static String[] reverse (String[] array){
        String[] result = new String[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }


    //22 reverses the given char array
    public static char[] reverse (char[] array){
        char[] result = new char[array.length];
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }

    public static boolean contains(int[] array, int element){

        for (int each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }
    /*
    another solution using for loop:
    public static boolean contains(int[] array, int num) {
        boolean contains = false;

        for (int i = 0; i < array.length; i++) { //{1,2,3,4,5}
            if (array[i] == num) { //3
                contains = true;

            }
        }

        return contains;
    }
     */

    //23 method returns true if the decimal number is contained in the double array, otherwise returns false
    public static boolean contains(double[] array, double element){

        for (double each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }

    //24 method returns true if the String is contained in the String array, otherwise returns false
    public static boolean contains(String[] array, String element){

        for (String each : array) {
            if(each.equals( element ) ){
                return true;
            }
        }

        return false;
    }

    //25 method returns true if the char is contained in the char array, otherwise returns false
    public static boolean contains(char[] array, char element){

        for (char each : array) {
            if(each == element  ){
                return true;
            }
        }

        return false;
    }

    public static int[] unique(int[] array){
        int [] result = {}; // empty array

        for (int each : array) {
            if(frequency(array, each) == 1){
                result=ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static double[] unique(double[] array){
        double [] result = {}; // empty array

        for (double each : array) {
            if(frequency(array, each) == 1){
                result=ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static String[] unique(String[] array){
        String [] result = {}; // empty array

        for (String each : array) {
            if(frequency(array, each) == 1){
                result=ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static char[] unique(char[] array){
        char [] result = {}; // empty array

        for (char each : array) {
            if(frequency(array, each) == 1){
                result=ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static int frequency(int[] array, int element){
        int count = 0;

        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return  count;


    }

    public static int frequency(double[] array, double element){
        int count = 0;

        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return  count;


    }

    public static int frequency(String[] array, String element){
        int count = 0;

        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return  count;


    }

    public static int frequency(char[] array, char element){
        int count = 0;

        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return  count;


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







    




