package day29_ReturnMethods;

public class SumOfThreeNum_Return {
    public static void main(String[] args) {

        sumOfThreeNumbers(10,20,30);
        System.out.println(sumOfThreeNumbers(10,20,30));

    }

    public static int sumOfThreeNumbers (int num1, int num2, int num3){
        int sum = num1+num2+num3;

        return sum;

    }
}
