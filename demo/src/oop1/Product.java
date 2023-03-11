package oop1;

public class Product {
	// instance variables
	private String name;
	private double price;
	// static variable or class variable
	private static double taxrate = 12;

	public static double getTaxrate() {
		return Product.taxrate;
	}

	// constructor
	public Product(String n, double p) {
		if (p < 0)
			throw new IllegalArgumentException("Invalid Price");
		
		this.name = n;
		price = p;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(getNetPrice());
	}

	public double getNetPrice() {
		return price + price * Product.taxrate / 100;
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}
}
