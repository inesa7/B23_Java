package utilities;

import day43_OOP_Encapsulation.AccessModifiers;

public class Data {

    public String str1, str2;

    public void method1(){}

    public void method2(){}

    public static String str3, str4;

    public static void method3(){}

    public static void method4(){}

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable); // public access modifier is reachable outside the package
        //System.out.println(AccessModifiers.defaultVariable); // default access modifier is not reachable outside the package
    }
}
