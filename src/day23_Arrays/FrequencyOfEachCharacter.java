package day23_Arrays;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "aaaaaggggjjkkksssds";
        String removeDuplicates = "";

        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i); // represents each character
            if(removeDuplicates.contains("" +ch)){ // if character is already contained in
                continue; //skip it
            }
            removeDuplicates+=ch;
        }
        System.out.println(removeDuplicates);

        String result = ""; //a2b1c3

        for (int j = 0; j <=removeDuplicates.length()-1 ; j++) { // 0 1 2 // nested loop

            char ch = removeDuplicates.charAt(j); //'a'
            int frequency = 0; // for frequency of char

                for (int i = 0; i <=str.length()-1 ; i++) {
                char each = str.charAt(i);
                if(each==ch){
                frequency++;
            }
        }

        result+="" + ch+frequency;
        }

        System.out.println(result);
    }
}
/*
 find the frequency of each characters from a string
			str = "aaaaaggggjjkkksssds";
			output:
				a2b1c3d1

		to solve this task:

	step1: need to know how to remove duplicates
	step2: need to know how to find the frequency of one character
	step3: use the loop and apply step 2 to the remaining characters of the string
 */
