package day51_Abstration.employeeTask;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, char gender, double salary, int id) {
        super(name, jobTitle, gender, salary, id);
    }

    public void developing(){
        System.out.println(getJobTitle()+getName()+ " is developing a new program");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+getName()+" is writing a code");
    }
}
