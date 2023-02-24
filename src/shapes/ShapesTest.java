package shapes;

public class ShapesTest {

    public static void main(String[] args){


        Measurable myShape;
        Measurable shape2;
        myShape = new Square(6.4);
        shape2 = new Rectangle(4.7,3.9);
        System.out.println(myShape.getArea());
        System.out.println(shape2);
        // shape2 without using perimeter is actual just an object and
        // does not provide any functionality until we use a method
        // of the Rectangle class.
        shape2.getWidth();
        // This give you an error because it is part of an abstract class
        // Quadrilateral which cannot be used on a main method as it is marked
        // as an incomplete class


    }
}