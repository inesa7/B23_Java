package day05_ArithmeticOperators;

public class Practice {
    public static void main(String[] args) {
        int number = 10;

        boolean isEvenyDivisibleby3 = number%3 == 0; //==:equal operator
        System.out.println(number+" is evenly divisible by 3: " +isEvenyDivisibleby3);

        boolean isEvenyDivisibleby5 = number%5 == 0;
        System.out.println(number+" is evenly divisible by 5: " +isEvenyDivisibleby5);// if the remanider of number/5 is zero, then its even
        System.out.println(number+" is evenly divisible by 3: " +isEvenyDivisibleby3);

    }
}
