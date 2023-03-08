package oop2;

public class ExDemo {

	public static void main(String[] args) {
		String st = "124";

		try {
			int v = Integer.parseInt(st);
			System.out.println(v);
		} catch (NumberFormatException ex) {
			System.out.println("Sorry! Invalid number!");
		}

		System.out.println("THe End!");
	}

}
