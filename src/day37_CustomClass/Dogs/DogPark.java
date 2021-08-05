package day37_CustomClass.Dogs;

import day37_CustomClass.Dogs.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bella";
        dog1.gender = "female";
        dog1.breed = "Shih poo";
        dog1.age = 7;
        dog1.size = "small";
        dog1.color = "white";

        System.out.println(dog1.name);
        System.out.println(dog1.gender);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.size);
        System.out.println(dog1.color);

        Dog dog2 = new Dog();
        dog2.setInfo("Bobby", "Shephard",
                "male", "Brown",
                "medium", 5);

        Dog dog3 = new Dog();
        dog3.setInfo("Lucas", "Kokapoo",
                "male", "beige",
                "medium", 6);


        dog1.bark();
        dog2.bark();
        dog3.bark();

        dog2.eat("chicken");
        dog3.drink("milk");
        dog1.play();

        dog2.getInfo();

        dog3.getInfo();

        Dog[] dogs = {dog1, dog2, dog3};
        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.addAll(Arrays.asList(dog1, dog2, dog3));







    }
}
