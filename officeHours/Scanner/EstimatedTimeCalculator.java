package Scanner;

import java.util.Scanner;

public class EstimatedTimeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your speed:");
        int carSpeed = scan.nextInt();

        if(carSpeed<40 || carSpeed>80){

            carSpeed = 60;
            System.out.println("It is not allowed");
        }
        scan.nextLine();
        System.out.println("PLease enter starting point:");
        String startingPoint = scan.nextLine();

        System.out.println("PLease enter destination:");
        String destination = scan.nextLine();

        System.out.println("PLease enter your distance between "+startingPoint+" to "+ destination);
        double distance = scan.nextDouble();

        double estimatedTime = distance/carSpeed;
        System.out.println("Estimated time of arrival is "+estimatedTime+" hours from "+startingPoint+" to "+destination);

        scan.close();
    }
}
/*
EstimatedTimeCalculator

                               Assume that you have a plan to go from A to B point
                               maxSpeed=80
                               minSpeed=40

                               - Ask the User
                                   - Car speed
                                               should be 40 - 80 mph
                                           -> if user enters smaller than minSpeed
                                                                   or
                                                               bigger than maxSpeed
                                           -   assign for speed 60 as default
                                           -   otherwise assign for speed userInput(int)

                                   - startingpoint(string) and destination(string)
                                   - distance between this two points(double)

                                   According to this information calculate triptime;

                                   Formula of estimatedTime = distance/speed;

                                      Ex :

                                           Inputs :50,San Antonio,Dallas,300

                                           "The Estimated Time Of Arrival is 6.0 hours from San Antonio to Dallas "
 */