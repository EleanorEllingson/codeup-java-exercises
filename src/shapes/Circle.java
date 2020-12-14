package shapes;


class Circle {
    private double radius;

    public Circle(double radius){
       this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

}

class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        Circle circle2 = new Circle(4.3);
        System.out.println(circle2.getCircumference());
    }

}

class ShapeHelper {
    public static double getArea(CircleRewritten circle){
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
    public static double getArea(Square square){
        return Math.pow(square.getLength(), 2);
    }
    public static double getCircumference(CircleRewritten circle){
        return 2 * Math.PI * circle.getRadius();
    }
}

class CircleRewritten {
    private double radius;
    public CircleRewritten(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}




