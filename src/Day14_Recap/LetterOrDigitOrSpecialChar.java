package Day14_Recap;

public class LetterOrDigitOrSpecialChar {
    public static void main(String[] args) {
        char ch = 'a';

        boolean isDigit = ch >= '0' && ch <= '9';

        boolean isLetter =  ( ch >= 'A' && ch <= 'Z')  ||  (ch >='a' && ch <= 'z') ;
        // if the character is upper case letter or lower case letter


        /* if else statement

        boolean isSpecialCharacter = !isDigit && !isLetter;
        String result = "";
        if(isDigit){
            result =  ch+ " is digit";
        }else if (isLetter){
            result = ch+ " is letter";
        }else{
            result = ch+" is special character";
        }
         */

        //ternary if
        String result =  (isDigit) ?  ch+ " is a digit" :(isLetter)? ch+ " is a letter" : ch+" is a special character";

        System.out.println( result);
    }
}
/*
Given a  char variable determine if the character is letter or digit or special character.
            Ex: 'b'  --> letter
                '9'  --> digit
                '!'  --> special character

 */