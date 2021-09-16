package day49_Exceptions;

import day43_OOP_Encapsulation.circle.Circle;

import java.util.InputMismatchException;


public class UncheckedExceptionHandlings {

    public static void main(String[] args) {

        String str = "Cybertek";
        try {
            System.out.println(str.charAt(200)); // StringOUtOfBounds
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block: RuntimeException occured");
        }

        str+=" School";

        System.out.println("---------------------------------------------");

        try{ // plan A handles first
            System.out.println("".substring(10, 20)); // Cybertek
        }catch (ArithmeticException e){ // plan B handles after plan A
            e.printStackTrace();
        }catch (NumberFormatException e){ // plan C
            e.printStackTrace();
        }catch (IllegalArgumentException e){  // plan D
            e.printStackTrace();
        }catch (InputMismatchException e){ // plan E
            e.printStackTrace();
        }catch (RuntimeException e){ // plan F
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("---------------------------------------------");

        Circle circle1= null;

        try{
            circle1.getRadius();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test completed");







    }
}
