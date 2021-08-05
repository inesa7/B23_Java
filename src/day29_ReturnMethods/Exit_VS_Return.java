package day29_ReturnMethods;

public class Exit_VS_Return {
    public static void main(String[] args) {

        passOrFail(90);
    }

    public static void passOrFail(int score){

        if(score<0 || score>100){
            System.out.println("Invalid");
            return;
        }

        if(score>=60){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }


    }
}
