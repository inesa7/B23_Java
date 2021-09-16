package Practice_08_25.cybertek;

import java.time.LocalDate;

public final class Tester extends Employee {


    public Tester(String name, char gender, LocalDate doB, int employeeId, String jobTitle, double salary) {
        super(name, gender, doB, employeeId, jobTitle, salary);
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }

    public void attendMeeting(){
        System.out.println(getJobTitle()+" "+getName()+" is attending scrum meeting");
    }

    @Override
    public void drink(String drink) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking "+drink);
    }




}

/*
create the following sub classes of Employee
  1. Tester
	        variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary
		    methods: work(), attendMeeting()
 */
