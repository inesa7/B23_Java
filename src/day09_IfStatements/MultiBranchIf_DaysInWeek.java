package day09_IfStatements;
/*
write a program that can print the name of day based on the number 1 ~ 7
            ex: number = 5;
                output:
                    Friday
 */
public class MultiBranchIf_DaysInWeek {
    public static void main(String[] args) {
        int number = 5;

        if(number == 1){
            System.out.println("Monday");
        }else if(number == 2){
            System.out.println("Tuesday");
        }else if(number == 3){
        System.out.println("Wednesday");
        }else if(number == 4){
            System.out.println("Thursday");
        }else if(number == 5){
        System.out.println("Friday");
        }else if(number == 6){
            System.out.println("Saturday");
        }else {
        System.out.println("Sunday");
        }
    }
}


