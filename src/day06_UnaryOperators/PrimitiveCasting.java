package day06_UnaryOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a = 10;
        long b = a; //implicit casting, done automatically

        double d = 10.0;
        int f = (int) (long)d;//explicit casting

        long n = 100;
        short m = (short)n;

        float q = 2.5f;
        int u = (int)q;

        long r = (long)q;
        short s = (short) q;

        System.out.println(  (double)2.5f);
        System.out.println(  (double) 10l);

        int w = 129;
        byte z = (byte) w;
        System.out.println("z = "+z);

        int e = 70000;
        short g = (short) e;
        System.out.println("g = "+g);
    }

}
