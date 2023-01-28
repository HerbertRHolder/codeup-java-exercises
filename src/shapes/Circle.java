package shapes;
import java.lang.Math;
public class Circle {
    private double radius;
    private static int count = 0;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }


    public double getArea(){
        return Math.PI * (Math.pow(this.radius,2));
    }
    public double getCircumference(){
        return Math.PI * 2 * this.radius;
    }

    public static int getCount(){
        return count;
    }

}
