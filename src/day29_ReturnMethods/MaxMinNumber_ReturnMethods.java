package day29_ReturnMethods;

public class MaxMinNumber_ReturnMethods {
    public static void main(String[] args) {

        int max = max(10,20);
        System.out.println(max);

        int min = min(30, 15);
        System.out.println(min);
    }

    public static int max(int a, int b){ // finding max number
        int max = 0;

        // using ternary: return (a > b)? a : b;

        if(a > b){
            max = a;
        }else{
            max = b;
        }
        return max;

    }

    public static int min(int a, int b){ // finding min number
        int min = 0;
        return (a < b)? a : b;


    }
}

// find max number between 10~20, then multiply it by 2