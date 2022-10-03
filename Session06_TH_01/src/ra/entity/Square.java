package ra.entity;

public class Square extends Rectangle{
    private double side;

    public Square() {
        this.side = 1;
        super.setWidth(1);
        super.setLength(1);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getWidth() {
        return this.side;
    }

    public void setWidth(double width) {
        this.setWidth(width);
        this.setLength(width);
        this.side = width;
    }

    public String toString(){
        return "A Square with side = "+this.side+", which is a subclass of "+super.toString();
    }

}
