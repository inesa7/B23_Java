package day18_Recap;

public class String_Methods_Practice {
    public static void main(String[] args) {
        String str = "abcd";
        int indexOfK = str.indexOf("k");

        System.out.println(indexOfK); // result will be -1 beacuse there is no "k" in the str

        System.out.println("------------------------");
        String sentence = "I like to learn C#, C# is cool";
        // verify if the sentence has "Java" and do not use contains_method

        if(sentence.indexOf("J")>=0){
            System.out.println("sentence has Java");
        }else{
            System.out.println("sentence does not have Java");
        }

        System.out.println("------------------------");
        String sentence2 = "I love Java, Java is cool";
        //                      index 7
        boolean isUnique = sentence2.indexOf("Java") ==sentence2.lastIndexOf("Java");
        //                                      7    ==                         13 - false

        System.out.println("My variable is unique");

        System.out.println("------------------------");
        String schoolName = "Cybertek School";

    }
}
