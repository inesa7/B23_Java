package day10_IfStatement_NestedIf;

public class Ternary {
    public static void main(String[] args) {
        int n = 100;
        String result = "";

        if(n%2==0){
            result = "even";
        }else{
            result = "odd";
        }
        System.out.println(result);

        System.out.println("---------------------");


        String result2 = (n%2==0)? "even" : "odd";

        System.out.println(result2);
    }
}
