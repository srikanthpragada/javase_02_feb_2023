package lib2;

import java.util.TreeSet;

class Circle implements Comparable<Circle> {
	private int x,y,r;

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}

	@Override
	public int hashCode() {
		return this.r;
	}

	@Override
	public boolean equals(Object obj) {
		Circle other = (Circle) obj;
		return r == other.r && x == other.x && y == other.y;
	}

	@Override
	public int compareTo(Circle other) {
		 return this.r - other.r;
	}

}

public class CustomerClassWithSet {

	public static void main(String[] args) {
		var circles = new TreeSet<Circle>();
		circles.add(new Circle(10,20,30));
		circles.add(new Circle(20,20,20));
		circles.add(new Circle(10,20,30));
		circles.add(new Circle(1,2,10));
		
		for(var c : circles) {
			System.out.println(c);
			System.out.println(c.hashCode());
		}
	}

}

