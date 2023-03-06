package oop2;

interface Printable {
	void print(); 
}

class MyPrintable implements Printable {
	@Override
	public void print() {
		 System.out.println("Hello!");
	}
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
       
		Printable obj = new MyPrintable();
		obj.print();
		
		// Anonymous inner class 
		Printable obj2 = new Printable()  {
			@Override
			public void print() {
				System.out.println("Hi!");
			}
		};
		
		System.out.println(obj2.getClass());
		obj2.print(); 
		

	}

}
