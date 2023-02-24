package shapes;

public class Square extends Quadrilateral{


    Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double l) {
        this.length = l;
    }

    @Override
    public void setWidth(double w) {
        this.length = w;

    }
}