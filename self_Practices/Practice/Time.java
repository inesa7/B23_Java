package Practice;

import java.util.*;

class Main {
    public static void main(String[] args) {
        //1. declare your variables here:

        int hour, minute, second;


        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        String amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:

        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);


    }
}
