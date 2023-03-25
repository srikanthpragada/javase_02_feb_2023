package lib2;

import java.util.Arrays;

public class PrintLargeNumbers {

	public static void main(String[] args) {

		var marks = new int[] { 90, 45, 34, 56, 78, 93, 24, 44 };

		// get avg of numbers 
		var avg = Arrays.stream(marks).average();
		var avgMarks = avg.getAsDouble();
		
		
		Arrays.stream(marks)
		      .filter(v -> v >= avgMarks)
		      .forEach(System.out::println);

	}

}
