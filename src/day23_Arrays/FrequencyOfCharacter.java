package day23_Arrays;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aabcccd";

        char ch = 'c';
        int frequency = 0; // this variable is for the frequency of ch

        for(int i = 0; i <=str.length()-1; i ++){
            char each = str.charAt(i); // this variable is for every single character in the string
            System.out.println(each);

            if(each==ch){ // if each character in the str is matching with ch
                frequency++; // then increase the frequency by 1
            }
        }
            System.out.println("frequency = " + frequency);
    }
}
/*
Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";
            input: 'c'
            output: 3
                    input: 'e'
                     output: 0
 */