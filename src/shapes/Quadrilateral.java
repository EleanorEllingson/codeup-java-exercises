package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        super();
    }

    public Quadrilateral() {

    }

    public void Measurable(double length, double width){
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }




    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public void setLength(double length) {
        this.width = length;
    }
}
