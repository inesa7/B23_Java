package day15_String;

import java.util.Scanner;

public class Replit_LastCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int lastIndex = word.length()-1;
        char lastCharacter = word.charAt( lastIndex  );

        System.out.println(lastCharacter);

    }
}
