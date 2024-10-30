package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double Area() {
		double a = getLength();
		double b = getWidth();
		return a * b;
	}
	
	public double Perimeter() {
		double a = getLength();
		double b = getWidth();
		return (a + b) * 2;
	}
	
	public boolean isSquare() {
		double a = getLength();
		double b = getWidth();
		if (a == b) {
			return true;
		}
		else return false;
	}
	
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(2.0, 1.5);
		System.out.println(rec1.Area());
	}

}
