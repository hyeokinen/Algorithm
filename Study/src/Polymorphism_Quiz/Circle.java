package Polymorphism_Quiz;

public class Circle extends Shape {

	public Circle(double r) {
		this.name = "원";
		this.area = r * r * Math.PI;
	}
}
