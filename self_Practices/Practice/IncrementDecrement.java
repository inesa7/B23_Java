package Practice;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a= 50;
        a = --a + a++ + a-- + a++;
        System.out.println(a);
        /*
        int a = 1; //a = 1-1=0+1=1-1=0-1=-1
        a = -a--  + a++  / -a--  * --a;
        //  -1   +  0     / -1    *  -1
        //  -1 +         0            * -1
        // -1   + 0
        // - 1
        System.out.println("a = " + a);
         */
    }
}
