package day15_String;

public class replace_method {
    public static void main(String[] args) {
        String sentence3 = "Python is an easy language";
        sentence3 = sentence3.replace("Python", "Java");//Java is an easy language
        System.out.println(sentence3);

        String sentence4 = "C# is a programming language, I like learning C#, C# is the best";
        sentence4=sentence4.replace("C#", "Java");
        System.out.println(sentence4);

        String sentence5="Dog is friendly, Dog is loyal, I love Dogs";
        sentence5=sentence5.replace("Dog", "Cat");
        System.out.println(sentence5);
    }
}
