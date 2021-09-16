package day52_Abstraction_Interface.animalTask;

public class Parrot extends Animal implements Playable, Flyable{
    public Parrot(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void play() {

    }
}
