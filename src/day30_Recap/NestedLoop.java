package day30_Recap;

public class NestedLoop {
    public static void main(String[] args) {

        for (int j = 1; j <= 5; j++) { //to repeat the inner loop for 5 times

            for (int i = 1; i <= 10; i++) { // inner loop to print out numbers 1~10
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");

        // find the frequency of characters

        String str = "abbccc"; // outer loop is to repeat inner loop for 6 times(abbccc)

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i <= str.length() - 1; i++) { // i: indexes of str
                if (str.charAt(i) == ch) { //
                    frequency++;
                }
            }

            System.out.println(ch+" - "+frequency);

//            if(frequency == 1){
//                System.out.println(ch);
            }

        }
    }


