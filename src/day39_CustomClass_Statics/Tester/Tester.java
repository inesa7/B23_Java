package day39_CustomClass_Statics.Tester;

public class Tester {

    public String name, jobTitle;
    public int employeeID, salary;

    public void setInfo(String name, String jobTitle, int employeeID, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void smokeTesting(){
        System.out.println(name+" is doing smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

    public void dailyStandUp(){
        System.out.println(name+" is participating in daily stand up");
    }
}
/*
create a class called Tester
        Attributes:
            name, employeeID, JobTitle, Salary
        Actions:
           setInfo(), smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */