package Day16_String_Continue;

import java.util.Scanner;

public class Replit_TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split?");
        String splitOrNo = scan.next();
        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();

        double tipPercent = 0;
        double totalTip = 0;
        double totalToPay = checkAmount+totalTip;
        double totalPerPerson = totalToPay/numberOfPeople;
        double tipPerPerson = totalTip/numberOfPeople;

        switch (serviceQuality){
            case "Poor":
                totalTip = checkAmount*0.05;
                break;
            case "Fair":
                totalTip = checkAmount*0.10;
                break;
            case "Good":
                totalTip = checkAmount*0.15;
                break;
            case "Great":
                totalTip = checkAmount*0.20;
                break;
            case "Excellent":
                totalTip = checkAmount*0.25;
                break;
        }


            totalToPay=checkAmount+totalTip;

        if (splitOrNo.equals("Yes")){
            totalPerPerson=totalToPay/numberOfPeople;
            tipPerPerson=totalTip/numberOfPeople;
        }else{
            totalPerPerson=totalToPay;
            tipPerPerson=totalToPay;
        }

        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);

        for (int i = 0; i<numberOfPeople; i++){
            System.out.print("&");
        }
        System.out.println();
        System.out.println("Total to pay: "+totalToPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+totalPerPerson);
        System.out.println("Tip per person: "+tipPerPerson);

    }

}
/*
Write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party
and if there is a split of the bill or not.
Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%
The program should display the following information based on the user input:
Split or No split (Yes or No)
Number of people entered: (number) (each person = & in output)
Check amount: (number)
Service Quality: (String)
Total to pay:
Total tip:
Total per person:
Tip per person:

Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */