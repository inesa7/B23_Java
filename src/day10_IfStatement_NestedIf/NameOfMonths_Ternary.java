package day10_IfStatement_NestedIf;

public class NameOfMonths_Ternary {
    public static void main(String[] args) {

        int number = 10;

        String result=(number==1)?"January":(number==2)?"February":(number==3)?"March":(number==4)?"April"
                :(number==5)?"May":(number==6)?"Jun":(number==7)?"July":(number==8)?"August":(number==9)?
                "September":(number==10)?"October":(number==11)?"November":(number==12)?"December":"Invalid Number";
        System.out.println(result);

    }
}






