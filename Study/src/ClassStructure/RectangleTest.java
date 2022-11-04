package ClassStructure;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		rect1.setWidth(30);
		rect1.setLength(50);
		System.out.println("넓이:" + rect1.area() + "cm^2");
		System.out.println("둘레:" + rect1.round() + "cm");

		
	}

}
