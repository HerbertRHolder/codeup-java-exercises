package shapes;

class Rectangle extends Quadrilateral implements Measurable{

    Rectangle(double l, double w) {
        super(l, w);
    }


    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setWidth(double w){
        this.width = w;
    }
    @Override
    public void setLength(double l){
        this.width = l;
    }

}