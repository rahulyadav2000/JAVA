import java.util.*;
public class shape {
	public static void main(String args[]) {
	Circle c = new Circle(10);
	Resizeable r = new ResizeableCircle(10);
	
	System.out.println("The perimeter of circle is" + c.getPerimeter());
	
	System.out.println("The area of circle is" + c.getArea());
	
	System.out.println("Circle is resized by " + r.resize(5)+ "%");
	
	
	}

}