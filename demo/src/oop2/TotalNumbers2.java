package oop2;

import java.util.Scanner;

public class TotalNumbers2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int total = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number :");
			try {
				int v = Integer.parseInt(s.nextLine());
				total += v;
			} catch (NumberFormatException ex) {
                System.out.println("Sorry! Invalid Number!!");
			}
		}
		System.out.println(total);
	}

}
