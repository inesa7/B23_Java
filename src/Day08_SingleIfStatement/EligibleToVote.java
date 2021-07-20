package Day08_SingleIfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "James";
        int age = 15;
        String citizen = "USA";

        boolean eligibleToVote = age >= 21 && citizen == "USA";

        if (eligibleToVote) { //person is eligible
            System.out.println(name + " is eligible to vote");
        }

        if (!eligibleToVote) { //person is not eligible
            System.out.println(name + " is not eligible to vote");
        }
    }
}
