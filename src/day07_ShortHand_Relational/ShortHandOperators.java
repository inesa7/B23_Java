package day07_ShortHand_Relational;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assignment operator =

        String name1 = "Muhtar";
        String name2 = "Muhtar";
        String name3 = name2;
        name2=name1; //name2 = "Muhtar";
        name1=name2; //name1 = "Muhtar";
        name1=name3; //name1 = "Mehmet";

        System.out.println("name1 "+name1);
        System.out.println("name2 "+name2);

        System.out.println("-----------------------");
        //addition assignment operator

        System.out.println("-----------------------");
        //division assignment operator /=
        int slices = 10;
        slices/=5;
        System.out.println("slices = " + slices);

        System.out.println("-----------------------");
        //remainder assignment operator %=

        int cents = 105;
        int quarters  = cents/25;
        System.out.println("quarters = " + quarters);

        cents %= 25;
        System.out.println("cents = " + cents);





    }
}
