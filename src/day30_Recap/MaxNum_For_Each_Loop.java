package day30_Recap;

public class MaxNum_For_Each_Loop {

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500};

        for (int each : numbers) { // int each - is elements of the array
            System.out.print(each + " "); // 100 200 300 400 500
        }

        System.out.println("----------------------------------------");

        // find max num
        int max = numbers[0];

        for (int each : numbers) { // number represents each number of the array
//            if(number >  max){
//                max = number;
//            }

            max = Math.max(each, max); // Math method returns the max number btw 2 numbers

        }

        System.out.println(max);

    }
}
