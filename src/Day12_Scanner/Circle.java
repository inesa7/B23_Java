package Day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = scan.nextDouble();
        double perimeter = radius*radius*3.14;
        double area = radius*2*3.14;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
/*
find the area and the perimeter of a circle
 */