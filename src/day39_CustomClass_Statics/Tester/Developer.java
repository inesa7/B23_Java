package day39_CustomClass_Statics.Tester;

public class Developer {
    public String name, jobTitle;
    public int employeeID, salary;

    public void setInfo(String name, String jobTitle, int employeeID, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void unitTesting(){
        System.out.println(name+" is testing");
    }

    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
/*
create a class called Developer
          Attributes:
            name, employeeID, JobTitle, Salary
          Actions:
            setInfo(), coding(), unitTesting(), fixingBug(), toString()

 */
