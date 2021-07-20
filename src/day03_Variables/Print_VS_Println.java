package day03_Variables;

public class Print_VS_Println {

    public static void main(String[] args) {

        System.out.println("Hello Batch 23"); //appends new line after printing
        System.out.println("How are you today?");
        System.out.println("------------------");

        System.out.print("Hello Batch 23"); // does not append new line after printing
        System.out.print("How are you today?");
        System.out.println();
        System.out.println("------------------");
    }
}
