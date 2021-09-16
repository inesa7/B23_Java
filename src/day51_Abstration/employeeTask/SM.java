package day51_Abstration.employeeTask;

public class SM extends Employee{

    public SM(String name, String jobTitle, char gender, double salary, int id) {
        super(name, jobTitle, gender, salary, id);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+getName()+" is conducting stand up meeting");
    }
}
