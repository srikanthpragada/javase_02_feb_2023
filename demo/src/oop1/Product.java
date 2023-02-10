package oop1;

public class Product {
	// instance variables
	private String name;
	private double price;

	// constructor
	public Product(String n, double p) {
		name = n;
		price = p;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(getNetPrice());
	}
	
	public double getNetPrice() {
		return price + price * 0.12;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice; 
	}
}

