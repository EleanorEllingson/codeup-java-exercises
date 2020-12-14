package shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(){

    }




    public double getPerimeter() {
       return  2 * this.length + 2 * this.width;

    }

    public double getArea() {
        return this.length * this.width;
    }
}
