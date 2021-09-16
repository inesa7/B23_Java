package day51_Abstration.employeeTask;

public class Tester extends Employee{

    public Tester(String name, String jobTitle, char gender, double salary, int id) {
        super(name, jobTitle, gender, salary, id);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+getName()+" is writing test cases");
    }






}
