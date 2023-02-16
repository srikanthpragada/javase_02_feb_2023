package oop1;

class Item {
	protected String name;
	protected int price;
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
	}
	
	public int getNetPrice() {
		return this.price;
	}
}

class DiscountedItem extends Item  {
	protected int discountRate;
	public DiscountedItem(String name, int price, int discountRate) {
		super(name,price);
		this.discountRate = discountRate;
	}
	public void print() {
		super.print();
		System.out.println(this.discountRate);
	}
	
	public int getNetPrice() {
		return  this.price - (this.price * this.discountRate / 100);
	}
	
}

class ImportedItem extends Item  {
	protected int importDuty;
	public ImportedItem(String name, int price, int importDuty) {
		super(name,price);
		this.importDuty = importDuty;
	}
	public void print() {
		super.print();
		System.out.println(this.importDuty);
	}
	
	public int getNetPrice() {
		return  this.price + (this.price * this.importDuty / 100);
	}
}

public class TestItem {
	public static void main(String[] args) {
		  Item item = new DiscountedItem("Segate HD",10000,20);
		  item.print(); 
		  System.out.println(item.getNetPrice());
		  
		  item = new ImportedItem("iPhone 14 Pro",100000, 15);
		  item.print();
		  System.out.println(item.getNetPrice());
	}

}
