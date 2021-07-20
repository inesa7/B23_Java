package day30_Recap;

public class While_Loop2 {
    public static void main(String[] args) {
        String sentence = "I love Java, Java is cool, Java is fun";
        String word = "Java";
        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, ""); // replaces the first matching word from sentence with empty string
            count++;
        }

        System.out.println(count);


    }
}
