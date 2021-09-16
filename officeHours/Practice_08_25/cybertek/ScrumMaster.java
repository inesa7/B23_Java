package Practice_08_25.cybertek;

import java.time.LocalDate;

public class ScrumMaster extends Employee {

    public ScrumMaster(String name, char gender, LocalDate doB, int employeeId, String jobTitle, double salary) {
        super(name, gender, doB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is removing blockers");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending scrum meeting");
    }



}

/*

 */
