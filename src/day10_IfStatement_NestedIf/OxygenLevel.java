package day10_IfStatement_NestedIf;
/*
You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
				Above 90 -  Your tank is full
				Above 80 -  Still okay
				Above 70 -  Don't go too far
				Above 60 -  Start to head back
				Above 50 -  Be careful now you at at 50%

				USE ONE PRINT STATEMENT ONLY
 */
public class OxygenLevel {
    public static void main(String[] args) {
        int level = 50;
        String message = "";

        if(level>90){
            message = "Your tank is full";
        }else if(level>=80){
            message = "Still okay";
        }else if(level>=70){
            message = "Don't go too far";
        }else if(level>=60){
            message = "Start to head =back";
        }else if(level>=50){
            message = "Be careful now you are at 50%";
        }

        System.out.println("message = " + message);

    }
}
