package oop2;

import java.time.Month;

enum PaymentMode {
	CASH, UPI, CARD
}

class Payment {
	PaymentMode mode;
	int amount;
}

public class EnumDemo {

	public static void main(String[] args) {
		PaymentMode pm;
		
		pm = PaymentMode.UPI;
		
		System.out.println(pm);
		
		System.out.println(Month.APRIL);

	}

}
