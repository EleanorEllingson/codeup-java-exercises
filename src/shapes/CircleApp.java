package shapes;
import util.Input;
import shapes.Circle;
public class CircleApp {

    public static void main(String[] args) {
        Input input1 = new Input();

        double radius = input1.getDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area: " + String.format("%.2f", circle.getArea()));
        System.out.println("Circumference: " + String.format("%.2f", circle.getCircumference()));

    }

}
