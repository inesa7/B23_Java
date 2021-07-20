package day30_Recap;

public class For_Loop {
    public static void main(String[] args) {

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println(7);
//        System.out.println(8);
//        System.out.println(9);
//        System.out.println(10);

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" "); // 1 2 3 4 5 6 7 8 9 10
        }

        System.out.println("--------------------------------------");

        String str = "Java"; // index: 0123

        for (int i = 0; i <= str.length()-1; i++) {
            System.out.print(str.charAt(i)+" "); // "Java"
        }

        System.out.println();

        for (int i = str.length()-1; i >= 0; i--) { //reverse order
            System.out.print(str.charAt(i)+" "); //  "avaJ" reverse
        }

        System.out.println();

        for (int i = 1, ch = 65; i <= 26 ; i++, ch++) {
            System.out.print(i+" . "+(char)ch);
        }

        System.out.println();

        for (int i = 26, ch = 90; i >= 1 ; i--, ch--) {
            System.out.print(i+". "+(char)ch);
        }
        System.out.println();
        System.out.println("----------------------");

        String word = "Python";
        String reverse = "";
        boolean isPalindrome = word.equals(reverse);

        for (int i= word.length()-1; i>=0; i--) { // i is index numbers of word in reversed order
            reverse += word.charAt(i);
        }

        System.out.println("isPalindrome = " + isPalindrome);

    }
}
