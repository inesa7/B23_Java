package day10_IfStatement_NestedIf;

public class GradeReport_NestedIf {
    public static void main(String[] args) {
        int score = 85; //0~100
        String grade = ""; // A,B,C,D,F
        
        if(score>=0 && score<=100){  //pre-condition: if the score is valid
            if(score >=90){
                grade = "A";
            }else if(score >=80){
                grade = "B";
            }else if(score >=70){
                grade = "C";
            }else if(score >=60){
                grade = "D";
            }else{
            grade = "F";
            }
            }else{
                grade = "Invalid";

            System.out.println("grade = " + grade);
                
            }
                
            }
        
        
    }
