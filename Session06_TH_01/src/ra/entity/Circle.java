package ra.entity;

public class Circle extends  Shape{
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double s = Math.pow(this.radius,2)*Math.PI;
        return s;
    }
    public double getPerimetter(){
        double c = Math.PI*this.radius;
        return c;
    }
    public String toString(){
        return "A Circle with radius = "+this.radius+", which is a subclass of "+super.toString();
    }
}
