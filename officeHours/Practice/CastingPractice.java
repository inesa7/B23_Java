package Practice;

public class CastingPractice {
    public static void main(String[] args) {
        /*byte<short<int<long<float<double

        Type of casting:

        1. IMPLICIT:
        -smaller type to bigger type
        -done by compiler
        -data is not lost

            double a = 5;

        2. EXPLICIT:
          -bigger type to smaller type
          -done by developer
          -data is lost

            double b = 5.3;
            int i = (int)b;

         */
        //byte to short
        byte b = 10;
        short s = b; //implicit casting
        System.out.println(b);

        //double to int
        double a = 5.3;
        int i = (int)a; //explicit casting
        System.out.println(i); //5
        a=i;

        //long to int
        long l = 999999999l;
        int ii = (int)l;
        System.out.println("ii :"+ii);
    }
}
