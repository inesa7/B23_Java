package day19;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {

        String str = "ABABAACCC";
        String removeDup = "";

        for (int i = 0; i < str.length(); i++) {

            if(! removeDup.contains(""+str.charAt(i))){
                removeDup+=str.charAt(i);
            }
        }

        System.out.println(removeDup);

        String word = "cccaaattt";
        String result="";

        for (int i = 0; i < word.length(); i++) {

            if(! result.contains(""+word.charAt(i)))
            result+=word.charAt(i);
        }

        System.out.println(result);
    }
}
/*
 //char[] str = str.toCharArray(); //"aaabbcccc"

        String removeDup = ""; //"abc"
        String result = "";


        //remove duplicates
        for (int j = 0; j < str.length(); j++) {
            char each = str.charAt(j); //"aaabbcccc"
            if (!removeDup.contains("" + each)) {
                removeDup += each; //"abc"
            }
        }


        for (char each : removeDup.toCharArray()) { //abc

            //frequency of characters
            int frequency = 0;
            for (char each1 : str.toCharArray()) { //"aaabbcccc"
                if (each == each1) {
                    frequency++;
                }
            }
            result += frequency + ""+each;
        }
        return result;
 */
