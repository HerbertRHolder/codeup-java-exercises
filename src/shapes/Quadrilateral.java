package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
   protected double length;
   protected double width;
    Quadrilateral(double l, double w){
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;
    }
    // from shape
    public void setWidth(double w){
        this.width = w;
    }
    public void setLength(double l){
        this.width = l;
    }



}