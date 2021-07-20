package Practice;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:"); // Inna
        String word = scan.nextLine();
        String result = "";

        for (int i = word.length()-1; i >= 0; i--) {
            result+= i;
        }
        System.out.println(result);
    }
}
// reverse the string