package shapes;

public interface Measurable {
        double length = 0;
        double width = 0;

//    public default Measurable(double length, double width){
//        this.length = length;
//        this.width = width;
//    }


    public default double getArea() {
        return length * width;
    }


    public default double getPerimeter() {
        return  (2 * length) + (2 * width);

    }



}
