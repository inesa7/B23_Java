package Day16_String_Continue;

import java.util.Scanner;

public class Replit_equal_TeacherStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        String str1 = new String("Chen");

        if(name.equals(str1)){
            System.out.println("Teacher");
        }else{
            System.out.println("Student");
        }

    }
}

/*
The variable name holds a String user input
Write a conditional statement that will determine if the person is a student or teacher.
If name is equal to "Chen", print "teacher"
For any other input, print "student"
Examples:

input: Chen
output: teacher

input: Faa
output: student
 */
