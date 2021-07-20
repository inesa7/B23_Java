package day22_Recap;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 10;
        while(i<5){
            System.out.println("Hello");
        }



        System.out.println("-----------------");

        do{
            System.out.println("Hello");
        }while(i<5);

        int evenNumber = 0;
        int sum = 0;
        do {
            System.out.println(sum);
        }while(evenNumber%2==0);

    }
}
