package day19;

public class Rectangle {
    public static void main(String[] args) {
        /*
            1. print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
        */
        for (int i = 1; i <= 8 ; i++) {
            System.out.println("\t\t* * * * * *"); // \t\t paragraph space is needed if you want to print to the right
        }

        System.out.println();
        System.out.println("---------------------------------");
        /*
        2. print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *
         */

            System.out.println(" * * * * * *");

            for (int i = 1; i <= 8; i++) {
                System.out.println(" *         *");
            }

            System.out.println(" * * * * * *");
    }
}
