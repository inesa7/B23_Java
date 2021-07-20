package Day11_SwitchStatement;

public class Grade {
    public static void main(String[] args) {

        char grade = 'C';

        switch (grade){

            case 'A':
                System.out.println("excellent");
                break;

            case 'B':
                System.out.println("great job");
                break;

            case 'C':
                System.out.println("good");
                break;

            case 'D':
                System.out.println("passed");
                break;

            case 'F':
                System.out.println("failed");

            default:
                System.out.println("Invalid");


/*
        a char variable named grade is given. use switch statement to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            otherwise: invalid
         */

        }
    }
}
