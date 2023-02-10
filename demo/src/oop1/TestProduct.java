package oop1;

public class TestProduct {

	public static void main(String[] args) {
		 Product p1;  // object reference 
		 
		 p1 = new Product("iPhone 14 Pro", 100000);
		 p1.setPrice(90000);
		 p1.print(); 
		 
		 System.out.println(p1.getNetPrice());
	}

}
