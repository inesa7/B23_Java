package day38_CustomClass.Employees;

import day38_CustomClass.Employees.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeesAppleINC {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Inna", 'F', 7, "SDET", 110000);
        System.out.println(employee1); // Employee{name='Inna', gender=F, ID=7, jobTitle='SDET', salary= $110000.0}

        employee1.salary=115000; // to change salary later
        System.out.println(employee1); // prints out info with new salary

        Employee employee2 = new Employee();
        employee2.setInfo("Max", 'M', 97,"Developer", 130000);
        System.out.println(employee2); // Employee{name='Max', gender=M, ID=97, jobTitle='Developer', salary= $130000.0}

        Employee employee3 = new Employee();
        employee3.setInfo("Jack", 'M', 107,"QA", 100000);
        System.out.println(employee3);

        Employee employee4 = new Employee();
        employee4.setInfo("Anna", 'F', 808,"SDET", 120000);
        System.out.println(employee4);

        Employee employee5 = new Employee();
        employee5.setInfo("Tom", 'M', 15,"Developer", 140000);
        System.out.println(employee5);

        Employee employee6 = new Employee();
        employee6.setInfo("Nick", 'M', 25,"BA", 115000);
        System.out.println(employee6);

        Employee [] arr = {employee1, employee2, employee3, employee4, employee5, employee6};
        ArrayList <Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(arr));

        double budget=0;
        for( Employee each : employees){
            //System.out.println(each.name+" : "+each.salary);
            //System.out.println(each);
            budget = +each.salary;
        }

        System.out.println("budget = " + budget);

        System.out.println("-------------------------");
        ArrayList <Employee> list1 = new ArrayList<>(employees);
        list1.removeIf( employee -> employee.salary >= 130000); // remove all employees that are making less than 130000

        for ( Employee each : list1){
            System.out.println(each);
        }

        System.out.println("-------------------------");
        ArrayList <Employee> list2 = new ArrayList<>(employees);
        list2.removeIf( employee -> employee.salary >= 130000); // remove all employees that are

        for (Employee each : employees) {
            if(each.jobTitle.equals("SDET")){}
            list2.add(each);
        }

        for (Employee each : list2) {
            System.out.println(each);
        }

        list2.removeIf( p -> p.jobTitle.equals("SDET"));


    }


}
