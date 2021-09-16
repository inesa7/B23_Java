package day53_Interface;

import day45_Inheritance.employeeTask.*;
import day51_Abstration.shapeTask.Circle;
import day51_Abstration.shapeTask.Rectangle;
import day51_Abstration.shapeTask.Shape;
import day51_Abstration.shapeTask.Square;
import day53_Interface.WebDriverTask.ChromeDriver;
import day53_Interface.WebDriverTask.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(4, 5);

        Shape[] array = {
                new Circle(5),
                new Square(10),
                new Rectangle(4, 5),
        };

        System.out.println("--------------------------");

        Employee employee1 = new Tester(null, 'f', 1, 2, "", 100000);

        boolean isDeveloper = employee1 instanceof Developer;
        System.out.println(isDeveloper);

        boolean isTester = employee1 instanceof Tester;
        System.out.println(isTester);

        boolean isPerson = employee1 instanceof Person;
        System.out.println(isPerson);

        boolean isDriver = employee1 instanceof Driver;
        System.out.println(isDriver);

        System.out.println("---------------------------------------");

        ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(array));
        shapes.addAll(Arrays.asList(
                new Square(15), new Square(15), new Square(15),
                new Square(15), new Square(15), new Square(15), new Square(15),
                new Circle(10), new Circle(10), new Circle(10), new Circle(10), new Circle(10), new Circle(10),
                new Rectangle(100, 200), new Rectangle(100, 200), new Rectangle(100, 200), new Rectangle(100, 200),
                new Square(15)
        ));

        int numberOfSquares = 0,
                numberOfRectangles = 0,
                numberOfCircles = 0;

        for (Shape each : shapes) {
            if (each instanceof Rectangle) {
                numberOfRectangles++;
            } else if (each instanceof Square) {
                numberOfSquares++;
            } else {
                numberOfCircles++;
            }
        }

        System.out.println("-----------------------------------");

        WebDriver driver = new ChromeDriver();

        if (driver instanceof ChromeDriver) {
            System.out.println("Maximize window");
        } else {
            System.out.println("Minimize window");
        }
    }


}


