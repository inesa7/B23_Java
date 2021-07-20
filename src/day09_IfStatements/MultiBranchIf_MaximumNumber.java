package day09_IfStatements;

public class MultiBranchIf_MaximumNumber {

    public static void main(String[] args) {

        int a = 10, b= 20;

        if(a>b){
            System.out.println(a+" is maximum");
        }else if(b>a){
            System.out.println(b+" is minimum");
        }else{
            System.out.println("equal");
        }
    }
}
