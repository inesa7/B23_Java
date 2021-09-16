package day49_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionHandlings {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("");
        } catch (FileNotFoundException e){
            e.printStackTrace(); // gives the full report of the exceptions
        }

        System.out.println("Test completed");

        System.out.println("---------------------------------------------");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Test completed");

        try{
            System.out.println(100/0);
            System.out.println("Try Block");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Catch block");
        }finally {
            System.out.println("Finally block");
        }

        System.out.println("Test completed");

        System.out.println("---------------------------------------------");

        try {
            System.out.println("Cybertek".charAt(-1));
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
            System.exit(0); // to stop finally block not to execute it
        }finally {
            System.out.println("Finally block");
        }


    }
}
