package Day16_String_Continue;

public class replace_Method {
    public static void main(String[] args) {
        String email = "Cybertek@yahoo.com";
        email = email.replace("yahoo", "gmail"); //"Cybertek@gmail.com"

        System.out.println(email);

        String sentence = "C# is cool, C# is fun";
        sentence = sentence.replace("C#", "Java"); // replaces all the matching
        // Java is cool, Java is fun (replaced all values)

        System.out.println("-----------------------------------");

        // replaceFirst method - replaces the first matching only
        sentence = sentence.replaceFirst(", C#", ", Java");
        // C# is cool, Java is fun
        System.out.println(sentence);

        String s = "Cat Dog Cat Dog Cat";
        s = s.replace("Cat", "Dog"); // Dog Dog Dog Dog Dog

        s= s.replaceFirst("Cat", "Dog"); //Dog Dog Cat Dog Cat

        System.out.println(s);

    }
}
