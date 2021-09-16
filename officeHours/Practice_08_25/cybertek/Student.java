package Practice_08_25.cybertek;

import java.time.LocalDate;

public class Student extends Person{

    private int id;
    private String schoolName;

    public Student(String name, char gender, LocalDate doB, int id, String schoolName) {
        super(name, gender, doB);
        setId(id);
        setSchoolName(schoolName);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    public void attendClass(){
        System.out.println(getName()+" is attending Class");
    }


    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                " id=" + id +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
create the following sub classes of Person:
		            1. Student
		                    variables: name, gender, age, dateOfBirth, schoolName, studentId

		                    methods: study(), attendClass()
 */