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




            String s = "77";

            // Primitive int is returned
            int str1 = Integer.parseInt(s);
            System.out.print(str);

            // Integer object is returned
            int str2 = Integer.valueOf(s);
            System.out.print(str1);
        }
    }


