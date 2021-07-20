package Practice;

public class Relational_Unary_Shorthand_Operators {
    public static void main(String[] args) {

        /*boolean cond = true;
        int a=10;
        int b=5;
        System.out.println("========Data=======");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("cond = "+!cond);
        */

        //pre and post

        //System.out.println("a++ :"+a++); // 10 post increment
        //System.out.println(a);
        //System.out.println(++b); // 11 pre increment

        int a=10;
        a = a++ + a-- + ++a + --a - a--; //11 10 11 10 9
        //a = 10  + 11  +  11 + 10  - 10;
        System.out.println("a = " + a);
        System.out.println(a);

        int b = 5;
        b = ++b - b-- + b++ - --b;
        System.out.println("b = " + b);

        int c = 20;
        c = c++ - --c * ++c - c++;
        System.out.println("c = " + c);
        
        int d = 3;
        d = ++d * --d + d++ * d--;
        System.out.println("d = " + d);

    }
}
