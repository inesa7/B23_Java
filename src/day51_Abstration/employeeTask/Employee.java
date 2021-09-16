package day51_Abstration.employeeTask;

public abstract class Employee {

    private final String name;
    private final String jobTitle;
    private final char gender;
    private double salary;
    private final int id;

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            throw new RuntimeException("Invalid amount, cannot be less than zero");
        }
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public Employee(String name, String jobTitle, char gender, double salary, int id) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        setSalary(salary);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public abstract void work();


}
/*
Employee: Encapsulation, Inheritance, Abstraction, overriding, class & object, constructors

	Employee:
		name, gender, jobTitle, salary, id
		work();

	Tester extends Employee

	Developer extends Employee

	SM extends Employee

	Teacher extends Employee

	PO extends Employee
 */