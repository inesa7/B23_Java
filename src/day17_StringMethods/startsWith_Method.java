package day17_StringMethods;

public class startsWith_Method {
    public static void main(String[] args) {
        String sentence = "Cybertek school is the best";

        boolean startWithCybertek = sentence.startsWith("Cybertek");
        boolean startWithSchool = sentence.startsWith("School");

        System.out.println("startWithCybertek = " + startWithCybertek);
        System.out.println("startWithSchool = " + startWithSchool);

    }
}
