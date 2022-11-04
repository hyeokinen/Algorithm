package ClassStructure;

public class Circle {
	
	private int radius;
	private double pi = 3.14;
	private int count;
	
	public double area() {
		return radius*radius*pi;
	}
	
	public double round() {
		return 2*pi*radius;
	}

	public double num() {
		return count*radius*radius*pi;
	}
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
