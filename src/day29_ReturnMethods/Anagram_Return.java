package day29_ReturnMethods;

import java.util.Arrays;

public class Anagram_Return {

    public static void main(String[] args) {

        String str1 = "Earth";
        String str2 = "heart";

        boolean isAnagram = isAnagram(str1,str2);
        System.out.println(isAnagram);

    }
    public static boolean isAnagram(String str1, String str2){

        boolean isAnagram = true;
        String [] arr1 = str1.split("");
        String [] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i].equalsIgnoreCase(arr2[j])){
                    isAnagram=true;
                }
                else{
                    isAnagram=false;
                }
            }
        }
        return isAnagram;
    }
}

/* create a function that can check if 2 strings are anagram,
return true if the are anagram
isAnagram("listen", "silent")==> true 2 parameters
isAnagram("Java", "Python")==> false
*/
