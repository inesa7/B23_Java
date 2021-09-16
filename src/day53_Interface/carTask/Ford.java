package day53_Interface.carTask;

public class Ford extends Car{

    public Ford(String model, int year, String color, double price) {
        super("Ford", model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println("Starting Ford "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Ford "+getModel());

    }
}
