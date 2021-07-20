package Day11_SwitchStatement;

public class Months {
    public static void main(String[] args) {
        int number = 12;
        String name = "";

        if(number>=1 && number<=12) {

            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July"
                    : (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October"
                    : (number == 11) ? "November" : "December";

        }else{
            name = "Invalid";
            System.out.println(name);
        }
    }
}
