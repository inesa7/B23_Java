package day19;

public class ForLoopPractice2 {
    public static void main(String[] args) {
         // print A~Z

        for (int i = 65; i < 90; i++) {
            System.out.print((char)i+" ");
        }
        System.out.println();


        System.out.println("---------------------------------");

        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("----------------------------------");

        for (char i = 'Z'; i >='A' ; i--) {
            System.out.print(i+" ");
        }

        System.out.println();

        // print characters from 1000-3000 in same line separated by space
        for (char j = 1000; j <= 3000; j++) {
            System.out.print(j+" ");


        }
    }
}

