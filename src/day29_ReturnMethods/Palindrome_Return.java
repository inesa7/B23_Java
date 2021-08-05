package day29_ReturnMethods;

public class Palindrome_Return {
    public static void main(String[] args) {
        String str = "Anna";
        String reverse = reverse(str);
        isPalindrome(str);

        //using boolean ==> boolean isPalindrome = isPalindrome(str);
        //System.out.println("isPalindrome = "+isPalindrome);

    }

    public static String reverse(String str) { //ex: ABC
        String result = ""; //CBA

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void isPalindrome(String str){
    String reversedStr = reverse(str); // first: reverse the given string

        if(reversedStr.equalsIgnoreCase(str)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }


        /*
                using boolean isPalindrome:

        public static boolean isPalindrome(String str){
            String reversedStr = reverse(str);
            return (reversedStr.equalsIgnoreCase(str)) ? true : false; //ternary

         */
    }
    }







