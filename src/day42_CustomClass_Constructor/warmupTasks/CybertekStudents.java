package day42_CustomClass_Constructor.warmupTasks;

public class CybertekStudents {

    public String name;
    public int age;
    public char gender;

    public static String schoolName, fieldOfStudy, programmingLanguage;

    public CybertekStudents(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
        schoolName = "Cybertek School";
        fieldOfStudy = "IT";
        programmingLanguage = "Java";
    }

    public void attendClass(){
        System.out.println(name+" is attending class at "+schoolName);
    }

    public void replit(){
        System.out.println(name+" is working on "+programmingLanguage+" replits");
    }

    public void askForBreak(){
        System.out.println(name+" is asking for break");
    }

    public String toString() {
        return "CybertekStudents{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", gender =" + gender +
                '}';
    }
}
/*
create a class named CybertekStudent
            Variables:
                name, gender, age, schoolName, fieldOfStudy, programmingLanguage

            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics

            methods:
                attendClass():
                replit()
                toString()
 */
