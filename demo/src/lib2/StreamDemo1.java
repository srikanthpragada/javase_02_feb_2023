package lib2;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
		 
		var marks = new int[] {90,45,34,56,78,93,24,44};
		
		Arrays.stream(marks)
		      .filter( n -> n >= 50)
		      .sorted()
		      .forEach(System.out::println);
		
	}

}
