package ra.entity;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double s = this.length*this.width;
        return s;
    }
    public double getPerimetter(){
        double c = (this.length+this.width)*2;
        return c;
    }
    public String toString(){
        return "A Rectangle with length = "+this.length+" and width = "+this.width+", which is a subclass of "+super.toString();
    }
}
