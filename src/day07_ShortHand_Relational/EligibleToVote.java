package day07_ShortHand_Relational;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "James Cook";
        int age = 34;
        String citizen = "USA";
        int creditScore = 730;

        boolean eligibleToVote = age >18 && citizen == "USA" && creditScore >= 700;
        //                        34 > =18 && "UK" == "USA"
        //                          true && false;
        //                          false

        System.out.println(name+" is eligible to vote: "+ eligibleToVote);

        /*
        1. must be US citizen
        2. at least 18 years
        3. credit score must be 700
         */


    }
}
