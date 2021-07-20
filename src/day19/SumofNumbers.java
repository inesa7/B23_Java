package day19;

public class SumofNumbers {
    public static void main(String[] args) {
        //calculate the sum of all numbers between 1~100
        
        int sum = 0;
        
        for (int i = 0; i <=100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        
    }
}
