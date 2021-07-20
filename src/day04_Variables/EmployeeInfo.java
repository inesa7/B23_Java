package day04_Variables;
/*
Task:
    1. create a class named EmployeeInfo
                1. declare the following variables:
                    name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee
 */
public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName = "Christian";
        String lastName = "Cain";
        String fullName = firstName + "  "  +  lastName;
        String gender = "Male";
        System.out.println("Employee's full name is " + fullName);
        int age = 26;
        String companyName = "Apple, INC";
        String jobTitle = "SDET";

        boolean isFullTime = true;
        boolean isMarried = true;
        int salary = 110000;



        System.out.println(fullName + " works at " + companyName);


        //Aaron King is Male
        System.out.println("Christian Cain is Male");

        //Aaron King
        //Employee's full name is: Aaron King


        System.out.println(fullName + " is " + age + " years old ");
        System.out.println(fullName+"' job title is "+jobTitle);
        System.out.println(fullName+ " is full time employee: " +isFullTime);
        System.out.println(fullName+ " is married: "+isMarried);
    }
}
