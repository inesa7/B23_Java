package day45_Inheritance.animalTask;

public class Cat extends Animal { // Cat Is An animal

    public Cat(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void meow(){
        System.out.println(name +" is meowing");
    }


}


/*
Attributes:
    name, breed, gender, size, age, color
Actions:
    meow(), sleep(), eat(), drink(), toString()
 */
