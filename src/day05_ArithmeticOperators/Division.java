package day05_ArithmeticOperators;

public class Division {

    public static void main(String[] args) {
        System.out.println( 25 / 2 );
        System.out.println( 25.0 / 2 );
        System.out.println( 25 / 2.0 );
        System.out.println( 25d / 2 );

        int a = 100/3;
        System.out.println("a = " + a);

        double b = 100/3; //33.3333 or  33  or 33.0
        //     b = 33  ==> 33.0
        System.out.println("b = "+ b);

        double c = 100.0/3;
        System.out.println("c = "+ c);

        System.out.println("-------------------");

    }
}
