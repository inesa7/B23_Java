package Practice_08_25.cybertek;

import java.time.LocalDate;

public final class Developer extends Employee{

    public Developer(String name, char gender, LocalDate doB, int employeeId, String jobTitle, double salary) {
        super(name, gender, doB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is typing code");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending Grooming meeting");
    }

    @Override
    public void drink(String drink) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking "+drink);
    }



}
/*
Developer
		 variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary
         methods: work(), attendMeeting()
 */
