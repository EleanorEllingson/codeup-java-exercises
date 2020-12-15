package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        super(length, width);
    }


//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    public Rectangle(){
//
//    }

    public void setLength(double length){
    }
//
    public double getArea() {
        return length * width;
    }
//
//
    public double getPerimeter() {
       return  (2 * length) + (2 * width);

    }




//

}
