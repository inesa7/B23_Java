package Tasks;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] arrays = sentence.split(" ");

        String reversed = "";

        for (int i = arrays.length-1 ; i >=0 ; i--) {
            reversed+=arrays[i]+" ";
        }

        System.out.println(reversed);
    }
}
