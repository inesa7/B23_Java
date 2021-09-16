package day42_CustomClass_Constructor.employee;

import day42_CustomClass_Constructor.employee.Employee;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Sam");
        Employee employee2 = new Employee("John", "SDET");
        Employee employee3 = new Employee("Inna", "SDET", 123);
        Employee employee4 = new Employee("Inna", "SDET", 224, 120000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }
}