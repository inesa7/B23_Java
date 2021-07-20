package day10_IfStatement_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 95;
        String grade = "";
        
        if(score>90 && score<=100){
            grade = "A";
        }else if(score>80 && score<=89){
            grade = "B";
        }else if(score>70 && score<=79){
            grade = "C";
        }else if(score>60) {
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println("grade = " + grade);
            
        /*
score
grade:
A:90 <=score <=100
B:80 <= score <=89
C:70 <= score <=79
D:60 <= score <=69
F:score <60;
 */
    }
}
