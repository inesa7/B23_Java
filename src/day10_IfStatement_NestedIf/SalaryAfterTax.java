package day10_IfStatement_NestedIf;

public class SalaryAfterTax {
    public static void main(String[] args) {
        double salary = 68_000;
        double taxRate = 0;
        boolean isMarried = true;

        if(salary >= 130_000){
            taxRate = 0.35;
        }else if(salary>=100_000){
            taxRate = 0.30;
        }else if(salary>=80_000){
            taxRate = 0.25;
        }else{
            taxRate = 0.20;
        } 

        if(isMarried) {
            taxRate = 0.05; //tax rate will be subtracted by 5
        }
        
        double salaryAfterTax = salary - (salary*taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);
            
        
        /*
        Write a program that can calculate the salary after tax based on the following requirements.
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax, otherwise pays 5% extra tax

         */
    }
}
