package day07_ShortHand_Relational;

public class SwipeTwoNumbers {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = a; //20
        a=b; // a = 30
        b=c; // b = 20


        System.out.println("a = "+a);//30
        System.out.println("b = "+b);//20

    }
}
