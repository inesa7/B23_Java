package day10_IfStatement_NestedIf;

public class ConvertNumbersToWords {
    public static void main(String[] args) {
        //0~9
        //zero, one,two,three,four
        int number = 1;
        String word = "";

        if(number==0){
            word = "zero";
        }else if(number==1){
            word = "one";
        }else if(number==2){
            word = "two";
        }else if(number==3){
            word = "three";
        }else if(number==4){
            word = "four";
        }else if(number==5){
            word = "five";
        }else if(number==6){
            word = "six";
        }else if(number==7){
            word = "seven";
        }else if(number==8){
            word = "eight";
        }else {
            word = "nine";
        }

        //nested If:
        // if(number >=0 && number<=9){

        }
    }

