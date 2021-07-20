package Day11_SwitchStatement;
/*
Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
 */
public class EligibleForLoan_Ternary {
    public static void main(String[] args) {
        double yearlySalary = 80_000;
        int creditScore = 660;
        //String result="";

        /* regular If Statement
        if(yearlySalary >= 60000 && creditScore >= 650){

            result = "Loan Approved";
        }else{result = "Loan Denied";
        }
        */
        // Ternary If

        String result = (yearlySalary >= 60_000 && creditScore >=650)? "Loan Approved" : "Loan Denied";
        System.out.println(result);


    }
}
