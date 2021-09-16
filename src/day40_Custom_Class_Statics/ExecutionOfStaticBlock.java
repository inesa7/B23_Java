package day40_Custom_Class_Statics;

public class ExecutionOfStaticBlock {
    static {
        System.out.println("Static block");
    }

    public static void method1(){
        System.out.println("Method1");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
