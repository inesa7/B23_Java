package Day16_String_Continue;

public class indexOF_lastIndexOf_Method {
    public static void main(String[] args) {
        String sentence2 = "Java is a cool language";
        //      index:      0123456789
        int indexOfFirstA = sentence2.indexOf("a");// = 1
        int indexOfSecondA = sentence2.indexOf("a ");// = 3
        int indexOfThirdA = sentence2.indexOf("a c")  ;// = 8
        int indexOfFourthA = sentence2.indexOf("an");// = 16
        //int indexOfFifthA = sentence2.indexOf("ag"); // = 20

        //lastIndexOf_method
        int indexOfLastA = sentence2.lastIndexOf("a"); // = 20

        System.out.println("indexOfFirstA = " + indexOfFirstA);
        System.out.println("indexOfSecondA = " + indexOfSecondA);
        System.out.println("indexOfThirdA = " + indexOfThirdA);
        System.out.println("indexOfFourthA = " + indexOfFourthA);
        System.out.println("indexOfFifthA = " + indexOfLastA);

    }
}
