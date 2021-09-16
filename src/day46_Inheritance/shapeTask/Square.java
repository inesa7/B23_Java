package day46_Inheritance.shapeTask;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            return;
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        this.side = side;
        setSide(side);
    }




}
