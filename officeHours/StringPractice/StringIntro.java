package StringPractice;

public class StringIntro {
    public static void main(String[] args) {
        String s1 ="Java";
        String s2 ="Java";
        String s3 ="Java";
        String s4 ="JAVA";

        System.out.println("== operator");
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //true
        System.out.println(s1==s4); //false

        System.out.println("equals() method");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false


    }

}
