package day53_Interface.carTask;

public class CarShop {
    public static void main(String[] args) {


        Honda honda =new Honda("Civic",2018,"dark blue",19500);
        honda.drive();
        honda.start();
        System.out.println("---------------------------------------------");


        Ford ford =new Ford("Mustang",2019,"black",25800);
        ford.start();
        ford.drive();
        System.out.println("---------------------------------------------");


        Porsche porsche=new Porsche("Cayman",2017,"red",68000);
        porsche.start();
        porsche.drive();
        porsche.autoPark();
        System.out.println("---------------------------------------------");


        Audi audi =new Audi("A8",2020,"white",83400);
        audi.start();
        audi.start();
        audi.autoPark();
        System.out.println("---------------------------------------------");


        Tesla tesla =new Tesla("S",2021,"blue",120000);
        tesla.start();
        tesla.drive();
        tesla.selfDrive();
        tesla.charging();
        tesla.autoPark();
        System.out.println("---------------------------------------------");


        Nio nio =new Nio("ET7",2022,"white",68000);
        nio.start();
        nio.drive();
        nio.selfDrive();
        nio.autoPark();
        nio.charging();

    }
}
