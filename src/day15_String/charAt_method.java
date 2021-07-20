package day15_String;

public class charAt_method {
    public static void main(String[] args) {
        String str = "Muhtar";
        char ch1 = str.charAt(0);
        System.out.println("ch1 = " + ch1); //"M"

        System.out.println("---------------------------");

        String word = "Cybertek School";  //index: 0123456789...
        char ch2 = word.charAt(9);
        System.out.println("ch2 = " + ch2); // "S"

        String word2 = "Java";  //index: 0123
        char ch3 = word2.charAt(2);
        System.out.println("ch3 = " + ch3); //"v"


        String word3 = "Cybertek School"; // index =     0123456789 --> 9
        char ch = word.charAt(9); // call for character 'S'

        System.out.println("ch = " + ch);
    }
}
