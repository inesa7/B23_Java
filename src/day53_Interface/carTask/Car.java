package day53_Interface.carTask;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private String color;
    private double price;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public abstract void start();
    public abstract void drive();
    //public abstract void fly(); // cannot be in abstract class
    //public abstract void race(); // cannot be in abstract class


}
/*
        1. create an abstract class named Car

                private variables:
        make (final), model (final), color, year (final), price
        Encapsulate all the fields
        Add a constructor to set all the fields

                abstract method:
        start();
        driver();
        non-abstract method:
        toString
        */