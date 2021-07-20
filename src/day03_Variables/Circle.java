package day03_Variables;

public class Circle {

    public static void main(String[] args) {

        int r = 5;
        double pi = 3.14;

        double area = r * r * pi;       //area of circle: r * r = 3.14;
        double perimeter = 2 * r * pi;  //perimeter 2 * r &* 3.14

        System.out.print("Area: "); //does not append new line after printing
        System.out.println(area); //  appends new line after printing

        System.out.print("Perimeter: ");
        System.out.println(perimeter);

    }
}
