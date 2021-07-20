package day32_MethodOverloading;

public class WarmupTasks {

    public static void main(String[] args) {
        
        int sum2 = sumOf2Numbers(10,12); // 10+12=22
        System.out.println("sum2 = " + sum2);
        
        int sum3 = sumOf3Numbers(100, 200, 300); //100+200+300=600
        System.out.println("sum3 = " + sum3);
        
        int sum4 = sumOf4Numbers(1000, 2000, 3000, 4000); // 1000+2000+3000+4000=10000
        System.out.println("sum4 = " + sum4);


        //---------------------------------method overloading----------------------------------------
        
        int r1= sum(10,12); // 10+12=22
        int r2=sum(100,200,300); //100+200+300=600
        int r3=sum(1000,2000,3000,4000); // 1000+2000+3000+4000=10000

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        double r4=sum(10.5, 20.5);
        double r5=sum(2.5,3.2)+4.8;
        double r6=sum(2.5,3.2, 4.8);
        double r7=sum(2.1,3.4,3.4,5.2);

        System.out.println("r4 = " + r4); // 31.0
        System.out.println("r5 = " + r5); // 10.5
        System.out.println("r6 = " + r6); // 10.5
        System.out.println("r7 = " + r7); // 14.100000000000001

        
    }

    public static int sumOf2Numbers(int a, int b) {
        return a + b;
    }

    public static int sumOf3Numbers(int a, int b, int c) {
        return a + b + c;
    }

    public static int sumOf4Numbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    //---------------------------------method overloading----------------------------------------
    
    public static int sum(int a, int b) {return a+b; }

    public static double sum(double a, double b) { return a+b; }
    
    public static int sum(int a, int b, int c) {return a+b+c; }

    public static double sum(double a, double b, double c) {
        return a+b+c; }
    
    public static int sum(int a, int b, int c, int d) { return sum( sum(a,b), sum(c,d) );
        // or- return a+b+c+d;
        //or - return sum(a,b)+sum(c,d);
        }

    public static double sum(double a, double b, double c, double d) {
        return a+b+c+d; }






}
/*
Task1:
    1. create a method that can find the sum of two numbers
                    method name: sumOf2Numbers
                    
    2. create a method that can find the sum of three numbers
                    method name: sumOf3Numbers

    3. create a method that can find the sum of four numbers
                    method name: sumOf4Numbers

Task2:
    1. create a return method called addInteger that can add an Integer number after the  last index of an integer array

    2. create a return method called addDouble that can add a double number after the last index of a double array

    3. create a return method called addString that can add a String after the last index of a String array

    4. create a return method called addChar that can add a char after last index of a char array
 */