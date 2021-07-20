package Scanner;

import java.util.Scanner;

public class CarpetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter room type\n\tList of rooms\n-Bedroom\n2-Kitchen");
        String roomType= scan.nextLine();
        double area = 0;
        double unitPrice = 3.92;

        switch (roomType){
            case "Kitchen":
                System.out.println("Please enter radius:");
                double raduis = scan.nextDouble();
                //area=radius*radius*3.14;
                break;
            case "Bedroom":
                System.out.println("Please enter width:");
                double width= scan.nextDouble();
                //area=length*width;
                break;
            default:
                System.out.println("Invalid Room Type");
        }

        System.out.println("Please enter your delivery address");
        String address = scan.nextLine();
        scan.close();

        double totalCost = area*unitPrice;
        System.out.println("TotalCost for your carpet is "+totalCost+ "and it will be delivered to "+address+ "in one week");

    }
}
/*
CarpetShop

						- Ask the user which room do they need carpet? (String)
									List of Rooms
										Bedroom
										Kitchen

				            -> If the user gives other than these roomTypes ,  give an error message about "Invalid Room Type"

				        - Ask the user roomType dimensions (as meter and double)
				        		Kitchen is circle.Take radius from user
				        		Bedroom is square or Rectangle.Take length and width from user

				        - Ask the user to deliver address (String, multiple words)
				        - unitPriceForCarpet = 3.92
				        - totalcost = area*unitPriceForCarpet;

				        - Print in the following format:
				            Ex:
				                inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010

				                 "TotalCost for your carpet is 51.84 and it will be delivered 1300 Lamar St Houston TX 77010 in one week"

			Topic : String Methods

				Intro : String Pool
						equals Vs == Operator
						equalsIgnoreCase

				---------------------------------------

				(substring-length-concat)

 */