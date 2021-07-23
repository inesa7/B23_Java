package day34_LocalDateTimeWrapper;

public class WrapperClassMethods {

    public static void main(String[] args) {

        // convert string into int
        String str = "123";
        int num = Integer.parseInt(str);
        int num1 = Integer.valueOf(str); // unboxing
                // Integer wrapper class

        System.out.println(num - 1); // 122

        Integer num2 = Integer.parseInt(str); // Autoboxing
                 //    int primitive

        int num3 = Integer.parseInt(str);
        Integer num4 = Integer.valueOf(str);


    }
}
