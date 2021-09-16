package day51_Abstration.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {


        Teacher teacher=new Teacher("Inesa", "Teacher", 'F', 120000, 15 );
        teacher.work();
        System.out.println(teacher);

        Tester tester=new Tester("Mohammed", "SDET",'M' , 120000, 14);
        tester.work();
        System.out.println(teacher);

        Developer developer=new Developer("Fhillip", "Developer", 'M', 125000, 17);
        developer.work();
        System.out.println(developer);

        PO po=new PO("Ella", "PO", 'F', 126000, 18);
        po.work();
        System.out.println(po);

        SM sm=new SM("Aysu", "SM", 'F', 100000, 20);
        sm.work();
        System.out.println(sm);
    }
}
