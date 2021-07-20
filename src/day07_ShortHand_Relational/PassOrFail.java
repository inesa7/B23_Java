package day07_ShortHand_Relational;

public class PassOrFail {
    public static void main(String[] args) {
        String name = "Tom";
        int score = 59;
        boolean pass = score>= 60;
        System.out.println(name+ " passed the exam: " + pass);
        /*
        pass: score >=60
        fail: score <60
         */


    }
}
