package day43_OOP_Encapsulation.square;

public class SquareObject {

    public static void main(String[] args) {

        Square square1 = new Square(-1);

        System.out.println(square1.getSide()); //0.0

        square1.setSide(20);

        System.out.println(square1.getSide()); //20.0

        Square square2 = new Square(10);

        System.out.println(square1.equals(square2)); // false

        Square s1 = new Square(5);
        Square s2 = s1;

        s2.setSide(10);
        System.out.println(s1.getSide()+":"+s2.getSide());



    }
}
