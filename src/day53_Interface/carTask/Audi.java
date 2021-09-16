package day53_Interface.carTask;

public class Audi extends Car implements AutoPark{

    public Audi(String model, int year, String color, double price) {
        super("Audi", model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println("Starting Audi "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Audi "+getModel());

    }

    @Override
    public void autoPark() {
        System.out.println("Auto-parking Audi "+getModel());

    }
}
