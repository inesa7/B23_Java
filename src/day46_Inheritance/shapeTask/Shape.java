package day46_Inheritance.shapeTask;

public class Shape {

    private final String name;
    public static final boolean isShape, hasArea, hasPerimeter;

    public String getName() {
        return name;
    }

    static {
        isShape=true;
        hasArea=true;
        hasPerimeter=true;
    }

    public Shape(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
create a class called Shape
                        variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)

                        add a constructor that can set all the fields

                        methods: calcArea(), calcPerimeter(),
                                 toString(): returns the name, area and perimeter
                                 that are returned by calcArea(), calcPerimeter()
 */