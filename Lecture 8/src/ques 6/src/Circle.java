public class Circle implements GeometricObject {
	
	double radius;
	
	Circle() {
		radius = 1;
	}
	
	Circle(double r) {
		radius = r;
	}
	
	public double getPerimeter() {
		
	return 2*3.14159*radius;
			
	}
	
	public double getArea() {
		return 3.14*3.14*radius;
	}
	

}