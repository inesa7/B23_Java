package day28_Methods;

public class MethodsWithParameter {

    public static void main(String[] args) {

        eligibleToBuyAlcohol(30);

        positiveNegativeZero(5);

    }

    public static void eligibleToBuyAlcohol(int age){

        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }

    public static void positiveNegativeZero(int num){

        if(num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }


}
