package day43_OOP_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable); // public access modifier is reachable within the same package
        System.out.println(AccessModifiers.defaultVariable); // default access modifier is reachable within the same package
        // System.out.println(AccessModifiers.privateVariable); // private access modifier is reachable within the same package


        EncapsulationIntro obj = new EncapsulationIntro();

           /*
        System.out.println(obj.username);
        System.out.println(obj.password);

        obj.username = "H";
        obj.username = "123";

        System.out.println(obj.username);
        System.out.println(obj.password);

         */

        System.out.println(obj.getUsername()); // "Cybertek"
        System.out.println(obj.getPassword()); // "Cybertek123";


        obj.setUsername("H");
        obj.setPassword("Cybertek123456");

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());




    }
}
