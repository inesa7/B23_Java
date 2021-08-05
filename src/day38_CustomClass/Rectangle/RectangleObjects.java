package day38_CustomClass.Rectangle;

import day38_CustomClass.Rectangle.Rectangle;

public class RectangleObjects {

    public static void main(String[] args) {

        // w: 20, l: 30  first rectangle object

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(30, 20);
        System.out.println(rectangle1); // Rectangle{length= 30.0, width= 20.0, area= 600.0, perimeter= 100.0}

        //  w: 50, l: 10 second rectangle object

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(50, 10);
        System.out.println(rectangle2); // Rectangle{length= 50.0, width= 10.0, area= 500.0, perimeter= 120.0}


    }
}


