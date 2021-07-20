package day09_IfStatements;

public class CampusTime {
    public static void main(String[] args) {

        int time = 9;

        if(time >= 8 && time<=23){
            System.out.println("open");
        }else{
            System.out.println("closed");

            /*
            or we can do like this:
            int time = 9;
            String result = "";
            if(time >= 8 && time<=23){
            result = "open"
            }else{
            result = "Closed";
            }System.out.println("result = " + result);
             */
        }
    }
}
/*
Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not.
            Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message: “open”
            but if the time entered is outside of operating hours they should see: “ closed”

 */