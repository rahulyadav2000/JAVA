/*4.	Create an abstract base class called Shape. Use this class to store two double type values that could be used to compute the area of figures. Create two specific inherited classes called Triangle and Rectangle from the base class Shape. Add to base class an abstract member function display_area(). Write a test application ShapeTest that demonstrates the capabilities of the classes defined above.

   Definition of Done:
a)	The class definitions are defined as per the class diagram.
b)	Each class definition is stored in its own .java file.
c)	Base class constructors are invoked using super keyword.
d)	Function overriding is applied wherever applicable.
*/

abstract class Shape 
{
	Shape(double x, double y)
	{
            double side1;
            side1=x;
            double side2;
            side2=y;
	}
	abstract void display_area();
	
}	
	
	class Rectangle extends Shape
    {
	Rectangle(double x, double y)
	{
		super(x, y);
	}
	void display_area() 
	{
	System.out.println("Area = "+( side1*side2 ));
	}
    }

    class Triangle extends Shape
    {
    Triangle(double x, double y)
    {
    	super(x,y);
    }
    void display_area()
    {
    System.out.println("Area = "+( 0.5 * side1 * side2 ));
    }
    }

    class TestShape
    {

    	public static void main()
    	{

    		Shape s;
    		Triangle t =  new Triangle(10,20);
    		Rectangle r = new Rectangle(20,30);

    		s=r;
    		r.display_area();
    		s=t;
    		t.display_area();
    	}




    }