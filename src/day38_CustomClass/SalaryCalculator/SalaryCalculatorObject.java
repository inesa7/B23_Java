package day38_CustomClass.SalaryCalculator;

public class SalaryCalculatorObject {

    public static void main(String[] args) {

        SalaryCalculator employee1 = new SalaryCalculator();

        // employee1: $30/h, 40 hours per week, 8% state tax, 22% federal tax
        employee1.setInfo(30, 40, 0.08, 0.22);
        employee1.salary();
        System.out.println(employee1);

        SalaryCalculator employee2 = new SalaryCalculator();

        // employee2: $65/h, 35 hours per week, 7% state tax, 23% federal tax
        employee2.setInfo(65, 35, 0.07, 0.23);
        employee2.salary();
        System.out.println(employee2);



    }
}
