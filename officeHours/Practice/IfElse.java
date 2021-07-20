package Practice;
/* Task 4
Create  program to check whether a character is an alphabet or not
		An input character is an alphabet if it lies in between a-z or A-Z.
        INPUT : '.'
        EXPECTED : Your letter is not in alphabet
        INPUT : 'a'			EXPECTED : Your letter is in alphabet
 */
public class IfElse {
    public static void main(String[] args) {
        char letters = 'A';

        if((letters>='a' && letters<='z') || (letters>='A' && letters<='Z')){
            System.out.println("Your letter is in alphabet");
        }else{
            System.out.println("Your letter is not in alphabet");
        }
    }
}
