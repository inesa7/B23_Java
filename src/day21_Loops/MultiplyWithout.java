package day21_Loops;

public class MultiplyWithout {
    public static void main(String[] args) {
        int a = 5,
            b = 3;
        
        int result = 0;
        
        for(int i = 0; i<b; i++){
            result+=a;
        }
        System.out.println("result = " + result);
    }
}
/*
write a program that can multiply two numbers without using * operator
 */