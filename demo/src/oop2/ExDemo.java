package oop2;

public class ExDemo {

	public static void main(String[] args) {
		String st = "0";

		try {
			int v = Integer.parseInt(st);
			System.out.println(100 / v);
		} catch (NumberFormatException ex) {
			System.out.println("Sorry! Invalid number!");
		} catch (ArithmeticException ex) {
			System.out.println("Sorry! Zero is not valid!");
		}

		System.out.println("THe End!");
	}

}
