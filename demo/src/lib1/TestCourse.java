package lib1;

class Course {
	private String title;
	private int fee;

	public Course(String title, int fee) {
		super();
		this.title = title;
		this.fee = fee;
	}
	
	@Override 
	public int hashCode() {
		return this.fee; 
	}

	@Override
	public String toString() {
		return this.title + ":" + this.fee;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Course) {
			Course other = (Course) obj;  // downcasting 
			return this.title.equals(other.title) && this.fee == other.fee;
		} else
			return false;
	}
}

public class TestCourse {
	public static void main(String[] args) {
		var c1 = new Course("Java", 5000);
		var c2 = new Course("Python", 5000);
		var c3 = new Course("Java", 5000);

		System.out.println(c1.toString());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals("abc"));
		
		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());

	}

}
