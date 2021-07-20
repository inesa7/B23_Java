package day07_ShortHand_Relational;

public class FreeShipping {
    public static void main(String[] args) {

        double price = 15;
        boolean isPrimeMember = true;

        boolean isEligibleForFreeShipping = price >=25 || isPrimeMember;
        //                                  15>=25     || true==true
        //                                  false       || true
        //                                  true
        System.out.println("is Eligible for Free Shipping: " + isEligibleForFreeShipping);


    }
}
