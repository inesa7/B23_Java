public class RemoveDuplicates {

    public static void main(String[] args) {
        String word = "ababababab";
        String result = ""; // expected result "ab"

        for (int i = 0; i <= word.length() - 1; i++) {

            if (!result.contains("" + word.charAt(i))) {
                result += word.charAt(i);

            }
            System.out.println("result = " + result);
        }
    }
}

    /*option 2

    String str = "AABBBCCCCC";
    String removeDuplicates = "";

        for (int i = 0; i < str.length()-1; i++) {
        char ch = str.charAt(i); // represents each character
        if(removeDuplicates.contains("" +ch)){ // if character is already contained in the string then ==>
            continue; //skip it
        }
        removeDuplicates+=ch;
    }
        System.out.println(removeDuplicates);
}
    */