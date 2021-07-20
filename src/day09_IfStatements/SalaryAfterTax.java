package day09_IfStatements;

public class SalaryAfterTax {
    public static void main(String[] args) {

        int salary = 99_000;
        String maritalStatus = "married";

        if(salary >= 130_000){
            System.out.println("35%");
        }else if(salary>=100_000){
            System.out.println("30%");
        }else if(salary>=80_000){
            System.out.println("25%");
        }else {
            System.out.println("20%");
        }if(maritalStatus == "married") {
            System.out.println("he/she will pay 5% less tax");
        }else{
            System.out.println("he/she pays 5% extra tax");
        }
    }
}
/*
Write a program that can calculate the salary after tax based on the following requirements.
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax, otherwise pays 5% extra tax
 */