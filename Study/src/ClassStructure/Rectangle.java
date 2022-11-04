package ClassStructure;

public class Rectangle {

	int width;
	int length;
	
	
	
	public int area() {
		int areaMax =  width*length;
		return areaMax;
	}
	
	public int round() {
		int roundMax =  (width+length)*2;
		return roundMax;
	}
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	
}
