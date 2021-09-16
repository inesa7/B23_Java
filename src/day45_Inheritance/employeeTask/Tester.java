package day45_Inheritance.employeeTask;

public class Tester extends Employee{ // Tester IS AN employee, Tester IS A person

    public Tester(String name, char gender, int age, long id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void testing(){
        System.out.println(jobTitle+" "+name+" is testing");
    }






}
