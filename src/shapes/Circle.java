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







