public class RemoveDuplicates {

    public static void main(String[] args) {

        String word = "AABBACCAAAB";
        String result = ""; // expected result "ABC"

        for (int i = 0; i <= word.length() - 1; i++) {

            if (!result.contains("" + word.charAt(i))) {
                result += word.charAt(i);
            }
            System.out.println("result = " + result);
        }
    }
}
        /*
-----------------------------------------------------------------------
        option 2:

        String str = "AABBBCCCCC";
        String removeDuplicates = "";

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i); // represents each character
            if (removeDuplicates.contains("" + ch)) { // if character is already contained in the string then ==>
                continue; //skip it
            }
            removeDuplicates += ch;
        }
        System.out.println(removeDuplicates);
    }
}
---------------------------------------------------------------------
        Using array return method:

        public static String removeDup(String str) {

        char[] str = str.toCharArray(); //"aaabbcccc"

        String removeDup = ""; //"abc"
        String result = "";

        //remove duplicates:
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(j); //"aaabbcccc"

            if (!removeDup.contains("" + each)) {
                removeDup += each; //"abc"
            }
        }
---------------------------------------------------------------------------
    public class removeDuplicates {
        public static void main(String[] args) {
        removeDuplicates( "abababcccdaabbca");

    }

    public static String removeDuplicates(String str){
        String result = ""; //"ABC"

        for ( String each: str.split("")) {
            if (!result.contains(each)) {
                result += each;
            }
        }
        System.out.println(result);

        return "";
    }
}
        */