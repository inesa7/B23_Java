package day10_IfStatement_NestedIf;

public class GreaterOrEqual {
    public static void main(String[] args) {
        /*
      Write an expression using the conditional operator (? :) that compares the value
      of the variable x to 5 and results in:
      Display x if x is greater than or equal to 5 Display -x if x is less than 5
        */
        int x = 3;
        int num=(x>=5)?x:(-x);
        System.out.println(num);

        /*
        String result = (x>=5)? "x" : "-x";
        System.out.println(result);
         */



    }
}
