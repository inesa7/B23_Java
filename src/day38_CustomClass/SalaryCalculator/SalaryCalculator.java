package day38_CustomClass.SalaryCalculator;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate;

    public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "SalaryCalculator{" +
                ", salary= $" + df.format(salary()) +
                ", stateTax=" + df.format(stateTax()) +
                ", federalTax=" + df.format(federalTax()) +
                ", salaryAfterTax="+df.format(salaryAfterTax())+
                '}';
    }
}
/*
SalaryCalculator
    	Attributes:
    		hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

		Actions:
			setInfo(): sets all the fields of SalaryCalculator
			salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
			stateTax(): calculates the totalStateTax
			federalTax(): calculates the total federal tax
			salaryAfterTax(): calculates the salary after tax
			toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */