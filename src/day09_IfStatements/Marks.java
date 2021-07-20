package day09_IfStatements;
/*
Write a Java Program for the following logic:
If marks < 60, then print “Fail”
If marks >= 60, but less than 90, then print “Pass”
If marks >= 90, then print “Passed with Distinction”
 */
public class Marks {
    public static void main(String[] args) {
        int marks = 97;

        if(marks < 60){
            System.out.println("Fail");
        }else if(marks >= 60 && marks < 90){
            System.out.println("Pass");
        }else if(marks >= 90){
            System.out.println("Passed with Distinction");
        }
    }
}
