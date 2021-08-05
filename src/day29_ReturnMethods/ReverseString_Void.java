package day29_ReturnMethods;
// reverse a string "Java" ==> "avaJ"
public class ReverseString_Void {

    public static void main(String[] args) {
        String str = "Java";
        reverse(str);

    }

    public static void reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
