package shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double side){

    }

    public double getArea() {
        return length;
    }

    double perimiter = 2 * length + 2 * width;
    double area = length * width;

    public double Perimeter() {
        return perimiter;
    }

    public double Area() {
        return area;
    }
}
