import java.util.Arrays;

public class Char {

    public static void main(String[] args) {
        String word = "table";
        char ch = word.charAt(2);

        System.out.println("ch = " + ch);

        String words = "table";
        String[] array2 = words.split("");

        System.out.println(Arrays.toString(array2));


        char[] array = words.toCharArray();
        System.out.println(Arrays.toString(array));

        String sentence = "I love Java language";
        String[] array1 = sentence.split("Java language");
        System.out.println(Arrays.toString(array1));

    }
    
    
}
