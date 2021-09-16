package day42_CustomClass_Constructor.warmupTasks;

public class CybertekStudentsObjects {

    public static void main(String[] args) {

        CybertekStudents student1 = new CybertekStudents("Inna", 30, 'F');
        CybertekStudents student2 = new CybertekStudents("Ira", 40, 'F');

        System.out.println(student1);
        System.out.println(student2);

        student1.attendClass(); // Inna is attending class at Cybertek School
        student2.replit(); // Ira is working on Java replits

        student1.askForBreak(); // Inna is asking for break
        student2.askForBreak(); // Ira is asking for break
    }
}
