package Day11_SwitchStatement;

public class NumberOfPeopleOnTheShip {
    public static void main(String[] args) {
        int people = 100;

        switch(people){
            case 50:
                System.out.println("20 crew, 30 passengers");
                break;
            case 75:
                System.out.println("25 crew, 50 passengers");
                break;
            case 100:
                System.out.println("30 crew, 70 passengers");
                break;
            default:
                System.out.println("not a valid number");
        }

        /*
Given a number of people on the ship determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.
            Total: 50 | 20 crew, 30 passengers
            Total: 75 | 25 crew, 50 passengers
            Total: 100 | 30 crew, 70 passengers
            Any other number of people on the ship is not valid
         */
    }
}
