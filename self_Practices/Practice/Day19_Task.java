
package Practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Day19_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = "";

        if (word.length() == 5) {

            if (!result.contains(""+word.charAt(0))) {
                result += word.charAt(0);

            }if (!result.contains(""+word.charAt(1))) {
                result += word.charAt(1);

            }if (!result.contains("b")) {
                result += "b";

            }if (!result.contains("b")) {
                result += "b";

            }if (!result.contains("c")) {
                result += "c";
            }

        }
            else if(word.length()<5){
                System.out.println("Too Short.");
            }else{
                System.out.println("Too long.");
            }

        System.out.println(result);
        }

    }

/*
ask the user to enter a word. the word must be five characters long and
print the word without the duplicated characters,
but if the word is less than five characters long, print "Too Short."
and if the word is more than five characters long, print "Too long."

		Ex:
			input:
				aabbc
			 output:
			 	abc
 */