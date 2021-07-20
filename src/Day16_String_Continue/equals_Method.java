package Day16_String_Continue;

public class equals_Method {
    public static void main(String[] args) {
        String str1 = "Cat"; // string pool
        String str2 = new String("Cat"); //Java heap
        String str3 = new String("Cat"); //Java heap


        System.out.println(str1==str2); // false: because it compares memory location - string pool and heap
        System.out.println(str1.equals(str2)); // true: because it compares just the text inside ""

        System.out.println(str2==str3); // false: because it compares memory location - string pool and heap
        System.out.println(str1.equals(str3)); //true: because it compares just the text inside ""

        String word1 = "Java";
        String word2 = "java";
        System.out.println(word1==word2); //// false: because it compares memory location - string pool and heap
        System.out.println(word1.equals(word2)); //false: because uppercase and lowercase

    }
}
