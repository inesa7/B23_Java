package day53_Interface.carTask;

public class Porsche extends Car implements AutoPark{

    public Porsche(String model, int year, String color, double price) {
        super("Porsche", model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto-parking Porsche "+getModel());
    }

    @Override
    public void start() {
        System.out.println("Starting Porsche "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Porsche "+getModel());

    }
}
