package day18_Recap;

public class SwapEmail {
    public static void main(String[] args) {
        //String email = new Scanner(System.in).next(); if you reuse email

        String email = "mike_tyson@gmail.com";
        int indexOf_=email.indexOf("_");
        int indexOfAt=email.indexOf("@");
        String firsName = email.substring(0,indexOf_);
        String lastName = email.substring(indexOf_+1, indexOfAt);

        String remaining = email.substring(indexOfAt);

        System.out.println("firsName = " + firsName);
        System.out.println("lastName = " + lastName);
        System.out.println("remaining = " + remaining);

        String result = lastName+"_"+firsName+remaining;
        System.out.println(result);

    }
}
/*
EmailTask1:
			Assume that email address is constructed by person's first name and followed by an underscore and last name.
			Write a program that can swap first name with last name in the email (Separated by an underscore).
			If the email doesn't contain an underscore print the given input email.

			Ex:
				input: mike_tyson@gmail.com
				output: tyson_mike@gmail.com

 */