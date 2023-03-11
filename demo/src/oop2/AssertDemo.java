package oop2;

public class AssertDemo {
 
	public static boolean isEven(int n) {
		return n % 2 == 1;
	}

	public static void main(String[] args) {
		assert isEven(10) == true : "Invalid Result From isEven()";

	}

}
