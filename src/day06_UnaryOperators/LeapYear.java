package day06_UnaryOperators;
/*
2. create a class named LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020
            output:
                2020 is leap year: true
        Hint: if the number of years can be evenly divisible by 4, it's known as the leap year
        int number = 200;
        boolean isEven = number%2 == 0; // if the remainder of number/2 is equal to zero, then number is even number
        boolean isOdd = number%2 > 0; // if the remainder of number/2 is greater than zero, then number is odd

        System.out.println(number +" is an even number: "+isEven);
        System.out.println(number +" is an odd number: "+isOdd);
    }
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        boolean isLeapYear = year%4 == 0;
            //if the year is evenly divisible by 4, then it's leap year

        System.out.println(year+" is "+"leap year: "+isLeapYear);

    }
}
