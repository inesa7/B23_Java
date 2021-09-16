package day51_Abstration.carTask;

public abstract class Car { // car is a parent class

    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <=0){
            throw new RuntimeException("Invalid price: "+ price);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }

    public abstract void start(); // method is meant to be overridden






}
/*
Car
	Car:
		start();

	Toyota extends Car:
		start(): twist the key

	Audi extends Car:
		start(): push start button

	Tesla extends Car:
		start(): voice control

	BMW extends Car:
		start(): jump start
 */