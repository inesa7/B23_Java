package Day11_SwitchStatement;

public class PassOrFail {
    public static void main(String[] args) {

        char grade = 'L';

        // pass: A,B,C,D
        // F: fail

        switch (grade){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                    System.out.println("Failed");
                    break;

            default:
                System.err.println("Invalid Grade");
        }
    }
}
