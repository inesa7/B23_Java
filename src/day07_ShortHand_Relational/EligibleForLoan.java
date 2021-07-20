package day07_ShortHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {
        String name = "John";
        int age = 20;
        int workHistory = 1;
        double income = 70000;
        int creditScore = 680;

        boolean eligibleForLoan = age >=18 && workHistory >= 2 && income >=60000 && creditScore >= 700;

        /* in order to be eligible for loan
        age nust be 18 AND work history must be 2 years
        AND income must be 60000
        AND credit score must be 700
        */
        System.out.println(name + " is eligible for loan: " + eligibleForLoan);

                /*
                1.income must be at least 60K
                2.at least have 2 years of work history
                3. at least 700 credit score
                4. at least 18 years old
                 */

    }
}
