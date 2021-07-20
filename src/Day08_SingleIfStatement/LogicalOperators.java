package Day08_SingleIfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println( !true ); //false
        System.out.println( !false ); //true

        System.out.println( true == !false); //true
                            //true == true
        //System.out.println( true! == !true);
                            //true! = false

        int score = 80;
        boolean pass = score >= 60;
        //boolean failed = !passed;
        //boolean failed = score <= 60;

        int age = 21;
        boolean eligible = age >+ 21;
        boolean notEligible = !eligible; //opposite of eligible
    }
}
