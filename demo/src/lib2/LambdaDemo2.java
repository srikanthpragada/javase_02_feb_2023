package lib2;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
	     return s1.length() - s2.length();
	}
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		var names = new String[] {"Java", "C#", "JavasScript","Python","SQL"};
		
		//Arrays.sort(names, new LengthCompare());
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());
		
		for(var n : names)
			System.out.println(n);

	}

}
