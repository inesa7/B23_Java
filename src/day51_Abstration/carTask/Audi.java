package day51_Abstration.carTask;

public final class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("-----------------------");
        System.out.println("Press the break");
        System.out.println("Push the start button");
        System.out.println("---------------------------");
    }



}
/*
Audi extends Car:
		start(): push start button
 */