package Day14_Recap;

import java.util.Scanner;

public class TernaryStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1~7:");
        int number = scan.nextInt();

        String name = (number>=1 && number<=7)?
                    (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday"
                        :(number==4)? "Thursday" :(number==5)? "Friday"
                        :(number==6)? "Saturday":"Sunday" :"No such day";

        System.out.println("name = " + name);

    }
}
