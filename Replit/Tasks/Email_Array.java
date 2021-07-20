package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Email_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        boolean isMultiple = email.indexOf("@")==email.lastIndexOf("@");

        if(!(email.contains("@") && isMultiple)) {
            System.out.println("invalid email");
        }else{

            String[] arrays = email.split("@");
            System.out.println(Arrays.toString(arrays));

            // info@cybertekschool.com
            String id = arrays[0];      // info -> 0
            String domain = arrays[1]; // cybertekschool.com ->  1

            System.out.println("id = " + id);
            System.out.println("domain = " + domain);

        }
    }
}
/*
        if (!email.contains("@")) {
            System.out.println("invalid email");
        }else if(! isMultiple){
            System.out.println("invalid email");
        }else{
        */
/*
Given a String variable email, write code using split method
to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:

    email -> hello-gmail.com

    Output:
        invalid email

    email -> my@fancy@email.com

    Output:
    invalid email
 */