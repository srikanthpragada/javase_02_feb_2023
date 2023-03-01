package lib1;

record Contact(String name, String email, String mobile) { 
	 public void print() {
		 System.out.println(name);
		 System.out.println(email);
		 System.out.println(mobile);
	 }
}

public class TestRecord {

	public static void main(String[] args) {
		 var c1 = new Contact("Jack", "jack@gmail.com", "3939393");
		 var c2 = new Contact("Jack", "jack@gmail.com", "3939393");
		 c1.print(); 
		 System.out.println(c1.hashCode());
		 System.out.println(c2.hashCode());

	}

}
