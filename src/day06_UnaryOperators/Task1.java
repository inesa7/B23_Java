package day06_UnaryOperators;

public class Task1 {
    public static void main(String[] args) {
 /*       int a = 1;
        a = -a-- + a++ / -a-- * --a;
       System.out.println(a);
*/
        System.out.println("---------------");

        int a = 50;
        a = --a + a++ + a-- +a++;
        System.out.println(a);

        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);
        System.out.println("x = " + x);
        // y = 16 - 4

  /*      int a = 200;
        System.out.println( a++ );

        System.out.println("a = " + a);
       int y = 100;
       int result = y++ +1;
        System.out.println(result);

  */
    }
}
