package day30_Recap;

public class BranchingStatements {
    public static void main(String[] args) {

        for (int i = 0; i <=5 ; i++) {
            if(i == 3){
                // break; exits the loop only
                // return; exits the method
                //System.exit - terminates the system
            }
            System.out.println(i);
        }
        System.out.println("Hello"); // will not be printed because of return
    }
}
