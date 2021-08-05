package day29_ReturnMethods;

public class removeDuplicates {
    public static void main(String[] args) {
        removeDuplicates( "abababcccdaabbca");

    }

    public static String removeDuplicates(String str){
        String result = ""; //"ABC"

        for ( String each: str.split("")) {
            if (!result.contains(each)) {
                result += each;
            }
        }
        System.out.println(result);

        return "";

    }

}
/*
write a method that can remove the duplicates from the string
            "abababa"
            "ab"
 */



