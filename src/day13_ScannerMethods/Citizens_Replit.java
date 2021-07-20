package day13_ScannerMethods;
import java.util.Scanner;
public class Citizens_Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = scan.nextInt();
        int nonSeniorCitizens = scan.nextInt();

        System.out.println("What is new citizen's age?");
        int age = scan.nextInt();

        if(age>=65){
            seniorCitizens++;
            System.out.println("Senior Citizen");
        }else if(age<=65){
            nonSeniorCitizens++;
            System.out.println("Non-Senior Citizen");
        }

        System.out.println("New seniorCitizens " + seniorCitizens);
        System.out.println("New nonSeniorCitizens " + nonSeniorCitizens);

    }
}
/*
Declare int variables: seniorCitizens, nonSeniorCitizens, age
Create a Scanner object
Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
"Enter current count for seniorCitizens and nonSeniorCitizens:"
Ask user to enter age:
"What is new citizen's age?"
if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.
if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.
Last print another message:

"New seniorCitizens count ValueOfVariable"
"New nonSeniorCitizens count ValueOfVariable"

Example:

Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
 */