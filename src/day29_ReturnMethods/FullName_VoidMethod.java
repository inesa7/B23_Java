package day29_ReturnMethods;

public class FullName_VoidMethod {
    public static void main(String[] args) {
        fullName("cYbErTeK", "SCHOOL");
    }

    public static void fullName(String firstName, String lastName){

        firstName=firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();
        String fullName = firstName+" "+lastName;
        System.out.println("Full name = "+fullName);

    }
}
    /*
    write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                    output:
                    "Cybertek School"
     */