package day15_String;
// white spaces - blank spaces in the String
public class trim_method {
    public static void main(String[] args) {
        String schoolName = "          Cybertek School"; // prints with white (blank) spaces
        System.out.println("schoolName = " + schoolName);

        schoolName.trim(); // prints without white spaces "Cybertek School"
        schoolName = schoolName.trim(); // need to assign to a same name String
        System.out.println("schoolName = " + schoolName);

    }
}
