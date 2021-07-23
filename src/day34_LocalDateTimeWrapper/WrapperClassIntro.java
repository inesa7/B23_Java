package day34_LocalDateTimeWrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {

        short s = 10;
        int num = s;
        Integer num2 = (int) s ; // Autoboxing

        char ch = '@';
        Character ch2 = (Character) ch; // Autoboxing

        // Unboxing:

        Byte b1 = 10;
        byte b2 = b1;
        short b3 = b1;
        int b4 = b1;
        long b5 = b1;
        float b6 = b1;
        double b7 = b1;

        System.out.println("---------------------------------");

        byte c1 = 10;
        Byte c2 = c1; // Autoboxing
//        Short c3 = c1; // Short wrapper class only accepts short primitive
//        Integer c4 = c1; // Integer wrapper class only accepts short primitive
//        Long c5 = c1; // Long wrapper class only accepts short primitive
//        Float c6= c1; // Float wrapper class only accepts short primitive
//        Double c7 = c1; // Double wrapper class only accepts short primitive
        }
    }

