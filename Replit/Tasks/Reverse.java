package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String[] arrays = sentence.split(" ");
        String[] reversedArray = new String[arrays.length];

            int j = 0;
        for (int i = arrays.length-1; i >=0 ; i--) {
            reversedArray[j++]=arrays[i];
        }

        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.toString(reversedArray));



    }
}
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */