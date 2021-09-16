package day49_Exceptions;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            throw new RuntimeException("Radius of the circle cannot be negative");
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public static void main(String[] args) {

        Circle circle1 = new Circle(-10);

        System.out.println(circle1); // Radius of the circle cannot be negative

        Circle circle2 = new Circle(20);
        System.out.println(circle2); //


    }







}
