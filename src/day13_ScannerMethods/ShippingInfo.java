package day13_ScannerMethods;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number:");
        int buildingNumber = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street address:");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city number:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your zipcode:");
        String zipcode = scan.next();

        scan.nextLine();
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println(fullName + "\n"+buildingNumber + " "+ streetAddress +"\n"+
                cityName + ", "+ state+" "+zipcode);
    }
}
/*
ShippingInfo
    ask the followings:
        1. Builder Number (nextInt)
        2. Street Address (nextLine)
        3. City Name  (nextLine)
        4. State ( next )
        5. Zip Code (next)
        6. Full Name

    print the shipping info of the person

    Ex:
        Inesa Yun
        7 Landsend Dr
        Gaithersburg, MD 20878
 */