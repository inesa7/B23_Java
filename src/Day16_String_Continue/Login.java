package Day16_String_Continue;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correctUsername = "Cybertek@gmail.com";
        String correctPassword = "Cybertek123";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scan.next();

        System.out.println("Enter your password:");
        String password = scan.next();

        boolean canLogin = username.equals(correctUsername) && password.equals(correctPassword);

        if(canLogin){
            System.out.println("Logged in successfully");
        }else{
            System.out.println("Invalid username or password");
        }

        scan.close();

        }
}

/*Ask the user to enter username and password, and username can be typed either in lowercase or uppercase.
Still, the password must be exact in order to log in.
write a program to check if the user entered username &
passwords match with the saved username & password in the database.
If it's, then print "Logged in successfully". Otherwise, print "Invalid username or password."

        Assume that your username & password in the database are:
                                Cybertek@gmail.com
                                Cybertek123
        Ex:
            username: CYBERTEK@Gmail.com
            password: Cybertek123
            output:
                Logged in successfully
(edited)

3

3

2
 */

