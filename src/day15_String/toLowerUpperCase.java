package day15_String;

public class toLowerUpperCase {
    public static void main(String[] args) {
        String s = "cybertek";
        s.toUpperCase(); //this method creates new string because it cannot modify original string
        s = s.toUpperCase(); //need to assign a new string s = s.to....

        System.out.println(s);   //CYBERTEK

        System.out.println("---------------------------------------");
        //example 2:

        String s2 = "JAVA PROGRAMMING LANGUAGE";
        s2=s2.toLowerCase();
        System.out.println(s2); //java programming language

        System.out.println("---------------------------------------");
        //example 3:

        String name = "inesa";
        name = name.toUpperCase();
        System.out.println(name); //INESA


    }
}
