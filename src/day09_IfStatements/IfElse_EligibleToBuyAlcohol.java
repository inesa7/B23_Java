package day09_IfStatements;

public class IfElse_EligibleToBuyAlcohol {
//if person is 21 or older he is eligible
    public static void main(String[] args) {
        int age = 30;

        if(age >= 21){ //if person is 21 or older he is eligible
            System.out.println(age+" is eligible");
        }else{
            System.out.println(age+" is not eligible");
        }
    }

}
