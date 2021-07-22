package Methods;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println();
    }

    public static void fibo(int number){
        int p2=0;
        int p1=1;
        int result=0;
        System.out.println(p2);
        System.out.println(p1);

        for (int i = 0; i < number+1; i++) {
            result=p1+p2;

            System.out.println(result);

            p2=p1;
            p1=result;

        }
    }
}
