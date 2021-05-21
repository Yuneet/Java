package staticClass;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rectangle");
	}
}

class Circle1 extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class OverridingTest{
	static void print(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		print(line);
		print(new Shape());
		print(new Line());
		print(new Rect());
		print(new Circle1());
	}
}

