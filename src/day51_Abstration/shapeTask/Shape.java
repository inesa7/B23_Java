package day51_Abstration.shapeTask;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name= '" + name + '\'' +
                ", area= " + area()  +
                ", perimeter= " + perimeter()  +
                '}';
    }
/*
Shape

	Abstract Shape:
		area();

	Circle extends Shape:
		area(): r * r * PI

	Rectangle extends Shape:
		area(): w * l

	Square extends Shape:
		area(): s * s

 */





}
