package day19;

public class StringReverse {
    public static void main(String[] args) {


    String name = "Inesa";
        //index = 01234
    String reverseName = ""; //asenI

        for (int i = 4; i >= 0; i--) {
            System.out.println(name.charAt(i)); //getting the characters starting form last index to index 0
        }
}
}