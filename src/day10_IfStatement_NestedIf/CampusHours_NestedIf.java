package day10_IfStatement_NestedIf;
/*
Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
            Campus is open from 8 am(8) to 11 pm (23)
            If user enters a time within the open time they should see message : “open”
            but if the time entered is outside of operating hours they should see: “ closed”
            If the user enters an invalid hour (negative number or more than 24 hours)
            they should see an error message: “invalid time”
 */

public class CampusHours_NestedIf {
    public static void main(String[] args) {
        int time = 25;
        String message = "";

        if (time >= 8 && time <= 23) {

            if (time > +8) {
                message = "open";
            } else if (time <= 23) {
                message = "closed";
            }

        } else {
            message = "invalid time";
        }
        System.out.println("message = " + message);
        }
    }

