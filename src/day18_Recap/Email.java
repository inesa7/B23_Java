package day18_Recap;

public class Email {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";
        int indexOf = email.indexOf("_");
        int indexofAt = email.indexOf("@");

        String firsName = email.substring(0,indexOf);

       // firsName = firsName.charAt(0,1);
        //String lastName = email.substring(indexOf+1, indexOfAt);

    }
}
/*
EmailTask2:
		Assume that email address is constructed by person's first name and followed by an underscore and last name.
		Write a program that will print out information about user based on email. Print first name, last name, and domain.
	   	First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
   			Ex:
   				input:
   					craig_federighi@apple.com

				Output:
					First name: Craig
					Last name: Federighi
					Domain: apple
 */