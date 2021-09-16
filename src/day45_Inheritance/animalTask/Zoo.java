package day45_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Bella", "Shihpoo", 'F', "small", 7, "white");
        dog.bark();
        dog.eat("chicken");
        dog.drink("water");
        dog.sleep();

        System.out.println("---------------------------------------------------------");

        Cat cat = new Cat("Murka", "siam", 'F', "small", 3, "black");
        cat.meow();
        cat.eat("meat");
        cat.drink("milk");
        cat.sleep();

        System.out.println("---------------------------------------------------------");

        Tiger tiger = new Tiger("Murka", "siam", 'F', "small", 3, "black");
        tiger.roar();
        tiger.eat("meat");
        tiger.drink("water");

    }
}
