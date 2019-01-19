import java.util.*;
public class Circle {

    private final double PI = 3.14159;
    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}

class CircleTest
{
public static void main(String[] args) {

    double radius;
    Scanner keyboard = new Scanner(System.in);
    
        System.out.print("Enter the radius of a circle: ");
        radius = keyboard.nextDouble();
    

    CircleTest circleClass = new CircleTest();
    Circle circle = new Circle(radius);

    System.out.println("Area is " + circle.getArea());
    System.out.println("Diameter is " + circle.getDiameter());
    System.out.println("Circumference is " + circle.getCircumference());

}
}