package day37_CustomClass;

public class Cat { // attributes of object

    public String name;
    public String color;
    public String gender;
    public String breed;
    public int age;

    //actions of object:

    public void scratch(){
        System.out.println(name+" is scratching");
    }

    public void jump(){
        System.out.println(name+" is jumping");
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(String milk){
        System.out.println(name+" is drinking"+milk);
    }


    public void setInfo(String name, String color, String gender, String breed, int age) {
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.breed = breed;
        this.age = age;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name="Murka";
        cat1.color = "white";
        cat1.gender = "female";
        cat1.breed = "syam";
        cat1.age = 3;

        Cat cat2 = new Cat();
        cat2.setInfo("Kisa", "brown", "female", "small", 5);
        System.out.println(cat2);

        Cat cat3 = new Cat();
        cat3.setInfo("Luna", "black", "large", "white and furry", 9);
        System.out.println(cat3);

        Cat cat4 = new Cat();
        cat4.setInfo("Shuba", "grey", "large", "black", 9);
        System.out.println(cat4);

        cat1.scratch();
        cat2.jump();
        cat3.eat();

    }
}

/*
    Cat:
		Attribute: name, color, gender, age, breed....
		Actions: scratch(), breakThings(), jump(), eat(), drink(), meow()....
				 setInfo(), getInfo()
 */