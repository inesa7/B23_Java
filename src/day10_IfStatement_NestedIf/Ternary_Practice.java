package day10_IfStatement_NestedIf;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ternary_Practice {

    //if a person is eligible to vote
    public static void main(String[] args) {
        int age = 23;
        String result = (age >+21)?"Eligible" : "Not Eligible";

        /*if(age >= 21){
            result = "Eligible";
        }else{
            result = "Not Eligible";
        */
        System.out.println(result);

        System.out.println("------------------------------");

        int score = 80;
       // String result2 =
        System.out.println(  (score>=60)? "Pass" : "Fail"   );

        }
    }



