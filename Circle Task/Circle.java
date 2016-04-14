import java.lang.Math;
public class Circle {
	private double radius, area;
	
	public Circle(double radius) {
		this.radius = radius;
		this.area = (Math.PI * Math.pow(radius, 2));
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		double a = (Math.PI * Math.pow(r, 2));
		radius = r;
		area = a;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double a) {
		double r = (Math.sqrt( a / Math.PI));
		radius = r;
		area = (Math.PI * Math.pow(r, 2));
		
	}

}
