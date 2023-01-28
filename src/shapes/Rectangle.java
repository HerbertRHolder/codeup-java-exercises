package shapes;

public class Rectangle {
    protected double width;

    protected double length;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 5.7);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}