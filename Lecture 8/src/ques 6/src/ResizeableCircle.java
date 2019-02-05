public class ResizeableCircle extends Circle implements Resizeable {
	
	public ResizeableCircle(double radius) {
	super(radius);
	
	}
	

	public double resize(int percent) {
		return percent;
	}
}