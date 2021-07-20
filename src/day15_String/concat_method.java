package day15_String;

public class concat_method {
    public static void main(String[] args) {
    // to return the full name

    String firstName = "John";
    String lastName = "King";

        //String fullName = firstName + " "  + lastName; // using concatenation
        String fullName2 = firstName.concat(" ").concat(lastName); // using concat() method

        // its better to use  + sign concatenation
    }
}
