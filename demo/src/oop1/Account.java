package oop1;

public class Account {
	// instance variable
	private long acno;
	private String ahname;
	private double balance;

	// Constructor
	public Account(long no, String name) {
		acno = no;
		ahname = name;
	}

	// 	Methods 
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	public void print() {
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}

}
