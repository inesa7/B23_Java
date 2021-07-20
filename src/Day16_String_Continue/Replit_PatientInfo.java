package Day16_String_Continue;

import java.util.Scanner;

public class Replit_PatientInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!\n" + "Please enter your personal information:" +
                "\n"+"Enter your first name:");

        String firstName = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        System.out.println("Enter your email:");
        String email = scan.nextLine();

        System.out.println("Enter your street:");
        String street = scan.nextLine();

        System.out.println("Enter your city:");
        String city = scan.next();

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your zipcode:");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number:");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number:");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        System.out.println("Enter your height:");
        double height = scan.nextDouble();

        System.out.println("Enter your weight:");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");

        boolean isMarried = scan.nextBoolean();
        String fullName = firstName+", "+lastName;
        String address = street+", "+city+", "+state+" "+zipCode;
        String contacts = "work phone number - "+workPhoneNumber+", "+"personal phone number - "+personalPhoneNumber+", email: "+email;

        /* option1:

        System.out.println("Patient personal information");
        System.out.println("Full Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts);
        System.out.println("Age:" + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Married?: " + isMarried);
        */

        System.out.println("Patient personal information"+"\n"+"Full name: "+fullName+"\n"
                +"Address: "+address+"\n"+ "Contacts: "+contacts+", "+"\n"+"Age: "
                +age+"\n"+"Height: "+height+"\n"+"Weight: "+weight+" pounds"+"\n"+"Married: "+isMarried);

    }
}
/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.

Execution flow with example:

Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true

    1. build contacts variable by concatenating work phone, personal phone and email
    2. build fullName variable by concatenating first name and last name
    3. build address variable by concatenating street, city, state, zip code

        Output in the console:

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314,
personal phone number - 2406542314,
email: jamesmay@gmail.com
Age: 35 Height: 5.1 Weight: 173.2 pounds
Married?: true
 */