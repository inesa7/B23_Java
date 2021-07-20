package day07_ShortHand_Relational;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 101;

        boolean even = number %2 ==0;
        boolean odd = even == false; //if a number is not even, then its an odd number
                    //number%2 > 0;
                    //number%2 != 0;
        System.out.println(number+" is even number; "+even);
        System.out.println(number+" is odd number; "+odd);
    }
}
