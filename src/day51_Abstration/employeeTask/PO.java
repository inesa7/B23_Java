package day51_Abstration.employeeTask;

public class PO extends Employee {

    public PO(String name, String jobTitle, char gender, double salary, int id) {
        super(name, jobTitle, gender, salary, id);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+getName()+" is explaining user stories");
    }
}
