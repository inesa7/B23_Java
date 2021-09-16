package day52_Abstraction_Interface.animalTask;

public abstract class Animal {

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public static boolean breath = true;
    public static boolean sleeps = true;

    public Animal(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public abstract void eat();

    public abstract void drink();

    public abstract void sleep();

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Animal:
	name, breed, gender, size, age, color
	eat(), drink(), sleep(), toString()
 */







