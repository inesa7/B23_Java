package Practice;

public class Task3Day07 {
    /*
    Declare and Initialize 2 numbers.
Program should display if the first number is greater than second number. Output
should be in the following format:
“First number number is greater than Second number – True/False”
     */
    public static void main(String[] args) {
        int firstNumber = 30;
        int secondNumber = 20;

        boolean isGreater = firstNumber > secondNumber;

        System.out.printf("First number number is greater than Second number: "+ isGreater);
    }
}
