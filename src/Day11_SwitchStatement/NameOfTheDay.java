package Day11_SwitchStatement;

public class NameOfTheDay {
    public static void main(String[] args) {

        int number = 8;
        switch (number){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default: //if number is not 1~7
                System.out.println("Invalid");

        }
    }
}
