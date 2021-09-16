package day41_CustomClass_Constructor.ScrumTask;

public class Tester {

    public String name;
    public char gender;
    public String jobTitle;
    public int id;
    public double salary;


    public static boolean isCybertekStudent;
    public static boolean isEmployed;


    static {
        isCybertekStudent=true;
        isEmployed = true;
        }

    public Tester(String name, char gender, String jobTitle, double salary, int id) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

    public String toString() {
        return "Tester{" +
                "name = " + name + '\'' +
                ", gender = " + gender +
                ", jobTitle = " + jobTitle + '\'' +
                ", salary = $" + salary +
                ", id = " + id +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }


    }


