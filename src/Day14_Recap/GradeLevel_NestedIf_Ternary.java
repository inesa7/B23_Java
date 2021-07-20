package Day14_Recap;

import java.util.Scanner;

public class GradeLevel_NestedIf_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade number:");
        byte gradeNumber = scan.nextByte();
        String gradeLevel ="";

        if(gradeNumber>=1 && gradeNumber<=18){

            gradeLevel = (gradeNumber<=5)? "Elementary school" :(gradeNumber<=8)? "Middle school"
                    :(gradeNumber<=12)? "High school" :(gradeNumber<=16)? "College":"Grad school";

        }else { // if number is out of range 1-18
            System.out.println("Invalid");
        }
            System.out.println("gradeLevel = " + gradeLevel);

        scan.close();
        }
    }

/*
 Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given
 */