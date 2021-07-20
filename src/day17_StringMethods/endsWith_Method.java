package day17_StringMethods;

public class endsWith_Method {
    public static void main(String[] args) {
        String sentence = "Cybertek school is the best";
        boolean endsWithBest = sentence.endsWith("best");
        boolean endsWithSchool = sentence.endsWith("school");

        System.out.println("endsWithBest = " + endsWithBest);
        System.out.println("endsWithSchool = " + endsWithSchool);


    }
}
