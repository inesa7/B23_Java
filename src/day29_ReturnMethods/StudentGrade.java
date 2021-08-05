package day29_ReturnMethods;

public class StudentGrade {
    public static void main(String[] args) {
        grade(95);

    }

    // calculate the grade of the student based on the score


    public static void grade(int score){
        if(score>100 || score<0){  // if the score is invalid
            System.out.println("Invalid");
            return; // then exit the method
        }

        if(score>=90){
            System.out.println('A');
        }else if(score>=80){
            System.out.println('B');
        }else if(score>=70){
            System.out.println('C');
        }else if(score>=60){
            System.out.println('D');
        }else {
            System.out.println('F');
        }



    }
}
