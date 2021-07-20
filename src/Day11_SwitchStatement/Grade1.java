package Day11_SwitchStatement;

public class Grade1 {
    public static void main(String[] args) {
        char grade = 'B';

        switch(grade){
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
                break;

            default:
                System.out.println("invalid");

        }

        /*
        a char variable named grade is given. use switch statement to print the following messages:
                if the grade is 'A' print excellent
                if the grade is 'B' print great job
                if the grade is 'C' print good
                if the grade is 'D' print passed
                if the grade is 'F' print failed
                other wise print invalid
         */
    }
}
