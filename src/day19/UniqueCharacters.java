package day19;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcc";
        String result= "";

        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i); // a,a,b,c,c

        }
        boolean isUnique = str.indexOf('b') == str.lastIndexOf('b');

        System.out.println("isUnique = " + isUnique);


        }
    }

