package oop1;

class Person {
	protected String name, email;

	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}
}

class Employee extends Person {
	private String job, company;

	public Employee(String name, String email, String job, String company) {
		super(name, email);
		this.job = job;
		this.company = company;
	}
    
	@Override 
	public void print() {
		super.print();
		System.out.println(this.job);
		System.out.println(this.company);
	}
}

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Employee("Ellison", "ellison@oracle.com", "CEO", "Oracle"); // upcasting 
	    p.print(); // runtime polymorphism
	    p = new Person("Larry", "larry@gmail.com");
	    p.print(); 
	}

}
