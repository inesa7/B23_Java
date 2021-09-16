package day53_Interface.carTask;

public class Nio extends Car implements ElectricCar, AutoPilot{

    public Nio(String model, int year, String color, double price) {
        super("Nio", model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto-parking Nio"+getModel());
    }

    @Override
    public void selfDrive() {
        System.out.println("Self-driving Nio"+getModel());
    }

    @Override
    public void start() {
        System.out.println("Starting Nio"+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Nio"+getModel());
    }

    @Override
    public void charging() {
        System.out.println("Charging Nio"+getModel());
    }
}

