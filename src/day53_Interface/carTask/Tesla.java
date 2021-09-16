package day53_Interface.carTask;

public class Tesla extends Car implements ElectricCar, AutoPilot {

    public Tesla(String model, int year, String color, double price) {
        super("Tesla", model, year, color, price);
    }


    @Override
    public void autoPark() {
        System.out.println("Auto-parking Tesla "+getModel());
    }

    @Override
    public void selfDrive() {
        System.out.println("Self Drive mode Tesla "+getModel());
    }

    @Override
    public void start() {
        System.out.println("Starting Tesla "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Tesla "+getModel());
    }

    @Override
    public void charging() {
        System.out.println("Charging Tesla "+getModel());
    }
}
