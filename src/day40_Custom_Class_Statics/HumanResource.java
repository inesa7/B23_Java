package day40_Custom_Class_Statics;


import day38_CustomClass.Employees.Employee;

public class HumanResource {

    public static Employee employee1 = new Employee(); //to set info for employee1 need static block setInfo("John", 'M', 1, "SDET", 100000);
    public static Employee employee2 = new Employee();
    public static Employee employee3 = new Employee();
    public static Employee employee4 = new Employee();
    public static Employee employee5 = new Employee();

    //to set info for 5 employees need static block to be able to use them in other classes

    static {
        employee1.setInfo("John", 'M', 1, "SDET", 100000);
        employee2.setInfo("Nick", 'M', 2, "SDET", 110000);
        employee3.setInfo("Anna", 'F', 3, "QA", 90000);
        employee4.setInfo("Esra", 'F', 4, "BA", 110000);
        employee5.setInfo("Suat", 'M', 5, "PO", 115000);
    }


}
