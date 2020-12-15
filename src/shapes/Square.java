package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    //
//    public Square(double side){
//        super(side, side);

//    }
//    public double getPerimeter() {
//        System.out.println("Square implintation of perimiter");
//        return length * length;
//
//    }
//
//    public double getArea() {
//        System.out.println("Square implintation of area");
//        return Math.pow(length, 2);
//
//    }
//
//
//


//    public Square(double side) {
//        super(side, side);
//    }

    @Override
    public double getArea() {
        return 2 * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;
    }
    public void setWidth(double width){
        this.length = width;
    }
    public void setLength(double length){
        this.length = length;
    }

}
