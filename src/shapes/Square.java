package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);

    }
    public double getPerimeter() {
        System.out.println("Square implintation of perimiter");
        return length * length;

    }

    public double getArea() {
        System.out.println("Square implintation of area");
        return Math.pow(length, 2);

    }



}