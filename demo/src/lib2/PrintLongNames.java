package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class PrintLongNames {

	public static void main(String[] args) throws IOException {
		  var p = Path.of("d:\\classroom\\feb2j\\names.txt");
		  
		  var avgLen = 
			    Files.lines(p)
		       .mapToInt(s -> s.length())
		       .average()
		       .getAsDouble();
		  
		  System.out.println(avgLen);
		  
		  Files.lines(p)
		       .filter( s -> s.length() > avgLen)
		       .sorted()
		       .limit(2)
		       .forEach(System.out::println);
		   
	}
}
