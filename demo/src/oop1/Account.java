package oop1;

public class Account {
	// instance variable
	private long acno;
	private String ahname;
	private double balance;

	// Constructor
	public Account(long acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public Account(long acno, String ahname, double balance) {
		this(acno,ahname); // call another constructor 
		this.balance = balance;
	}

	// Methods
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}

	public void print() {
		System.out.println(this.acno);
		System.out.println(this.ahname);
		System.out.println(this.balance);
	}

}
