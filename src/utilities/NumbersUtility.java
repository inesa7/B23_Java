package utilities;

public class NumbersUtility {

        //isOdd
    public static boolean isOdd(int number) {
        boolean isOdd = number % 2 != 0;

        return isOdd;
    }

        //isEven
    public static boolean isEven(int number) {
        boolean isEven = number % 2 == 0;

        return isEven;

    }


        //subtraction
    public static int subtraction(int num1, int num2){
        int result = num1-num2;

        return result;
    }

        //addition

    public static int addition(int num1, int num2){
        int result1 = num1+num2;

        return result1;
    }

        //max

    public static int max(int num1, int num2){
        int max=0;
        if(num1>num2){
            max=num1;
        }else {
            max=num2;
        }
            return max;

    }

        //min

    public static int min(int num1, int num2){
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }

    }

        //cube

    public static int cube(int num){
        int n = num*num*num;
        return n;
    }

    }

