package Tasks;

public class uniqueChars_RemoveDupMethod {
    public static void main(String[] args) {

        String str = "java";
        System.out.println(uniqueChars(str));

    }

    public static String uniqueChars(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(""+str.charAt(i))){
                result +=str.charAt(i);
            }
            }
        return result;
        }
    }

/*
uniqueChars is a method that will accept any String and return the String without any duplicate characters

Examples:

uniqueChars("java") ==> "jav"
uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"







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

 */