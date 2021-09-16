package day43_OOP_Encapsulation.square;

public class Square {

    private double side;

    public Square(double side) { // constructor
        setSide(side);
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side<0){
            return;
        }
        this.side=side;
    }

    public double area(){
        return side*side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public boolean equals(Square square){
        return side == square.side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }

}
/*
create a class named Square
            private variables:
                side (double)

            Encapsulate All the private fields
                (side can not be set to negative)

            Add a constructor that can set the fields

            Extra methods:
                area(), perimeter(), toString(), equals()
 */
