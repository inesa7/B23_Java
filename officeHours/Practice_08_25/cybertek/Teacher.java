package Practice_08_25.cybertek;

import java.time.LocalDate;

public class Teacher extends Employee {

    public Teacher(String name, char gender, LocalDate doB, int employeeId, String jobTitle, double salary) {
        super(name, gender, doB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is working");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending meeting");
    }

    @Override
    public void drink(String drink) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking"+drink);
    }


}
/*
Teacher
		variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary
		methods: work(), attendMeeting()
 */
