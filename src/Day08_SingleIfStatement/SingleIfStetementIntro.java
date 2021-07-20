package Day08_SingleIfStatement;

public class SingleIfStetementIntro {

    public static void main(String[] args) {

        String name = "Inesa";
        int score = 90;
        boolean passed = score >=60; //this is reusable condition

        if(passed) {//if student passed exam
            System.out.println("Congrats "+name+", you passed the exam");
        }
            if (!passed){//if student failed exam
            System.out.println(name+" you failed exam");
        }

    }
}
