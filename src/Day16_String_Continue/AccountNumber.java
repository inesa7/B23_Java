package Day16_String_Continue;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account number");
        String account = scan.next();
        char firstChar = account.charAt(0);

        String result = "";

        switch (firstChar){
            case '2':  // the first character of account is 2
                if(account.length() ==7){ //if length of account is  7
                    result = "Valid Account";
                }else{ //if length of account is not 7
                    result ="INVALID: it should be 7 characters long";
                }
                break;

            case '5': // the first character of account is 5
                if(account.length() == 10){ // if length of account is  10
                    result = "Valid Account";
                }else{// if length of account is not 10
                    result = "INVALID: it should be 10 characters long";
                }
                break;

            default:
                result = "INVALID: first character need to be 2 or 5";
        }

        System.out.println(result);
        scan.close();

        }
    }

/*
Nested if statement:
         if (account.length() == 7 || account.length() == 10) {
            if (account.charAt(0) == '2' && account.length() == 7) { // if the first character is 2 && has 7 characters in total
                System.out.println("Valid account");
            } else if (account.charAt(0) == '5' && account.length() == 10) { // if the first character is 2 && has 7 characters in total
                System.out.println("Valid account");
            } else {
                System.out.println("Invalid account number");
            }

Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5
    or the account number lengths do not meet the expected results print “Invalid account number”

 */