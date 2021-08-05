package day38_CustomClass.Rectangle;

public class Rectangle {

    public double length, width;

    public void setInfo(double rectangleLength, double rectangleWidth) { // public void setInfo(double length, double width ){
        length = rectangleLength; //  this.length = length;
        width = rectangleWidth; //  this.width = width;
        // "this" keyword is used to avoid confusion when instance variable is the same name as local variable/parameter
    }

    public double calculateArea() { //double area = length*width; return area;
        return length * width;
    }

    public double calculatePerimeter() { // double perimeter = (length+width)*2; return perimeter;
        return 2*(length + width);
    }

    public String toString() {
        return "Rectangle{" +
                "length= " + length +
                ", width= " + width +
                ", area= " + calculateArea()+
                ", perimeter= "+ calculatePerimeter()+
                '}';
    }
    // shortcut "Generate" right click
}

/*
    create a custom class named Rectangle
        Attributes:
            length, width

    Actions:
        setInfo: sets the length and width of the rectangle
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
        getInfo(): prints the width, length, area and perimeter of the rectangle
 */