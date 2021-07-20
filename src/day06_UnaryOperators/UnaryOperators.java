package day06_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("a = "+a);
        ++a;//increment

        System.out.println(a);

        int b = 100;
        System.out.println("b = "+b);
        --b; //decrement

        int x = 10;
        //System.out.println( ++x); then change the value by 1
        System.out.println( ++x);
        System.out.println( ++x);

        int n1 = 50;
        int n2 = n1++;
        //n2 = 50, then change the value by 1, n1 = 51
        System.out.println("n1 = "+n1);
        System.out.println("n2 = "+n2);

        int a1 = 100; //101
        int a2 = ++a1;
        //a2 = 101,a1 = 101
        System.out.println("a1 = "+a1);
        System.out.println("a2 = "+a2);

        int r = 200;
        System.out.println(r++);// 200 - delay
        System.out.println("r= "+r);//201

        int p = 200;
        System.out.println(++p);// 201 - change the value by 1 immediately
        System.out.println("p = " + p);

        int y = 100;
        int result = y++ +1;
        //100 + 1 = 101, after y = 101
        System.out.println("y = " + y);
        System.out.println("result = " + result);

        int z = 100;
        int result2 = ++z+1;
        // 101 + 1 = 102
        System.out.println("z = " + z);
        System.out.println("result2 = " + result2);



    }
}
