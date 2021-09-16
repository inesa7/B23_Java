package day52_Abstraction_Interface.animalTask;

public class Cow extends Animal implements Playable, Swimmable {


    public Cow(String name, String breed, char gender, String size, int age, String color) {
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
    public void play() {

    }

    @Override
    public void swim() {

    }
}
