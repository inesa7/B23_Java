package Day12_Scanner;

import java.util.Scanner;

public class circle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Whats the radius");
        double radius = scan.nextInt();

        double area = radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
