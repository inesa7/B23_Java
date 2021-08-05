package day29_ReturnMethods;

public class PosNegZeroNum_Void {

// create a function that can check if the given integer is positive, negative or zero

    public static void main(String[] args) {

        positiveNegativeZero(7);
    }

    public static void positiveNegativeZero(int num) {

        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is zero");
        }
    }
}
