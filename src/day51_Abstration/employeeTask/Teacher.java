package day51_Abstration.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, String jobTitle, char gender, double salary, int id) {
        super(name, jobTitle, gender, salary, id);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+getName()+" is giving an assignment to students");
    }
}
