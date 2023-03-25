package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortNamesWithStream {

	public static void main(String[] args) throws IOException {
		  var p = Path.of("d:\\classroom\\feb2j\\names.txt");
		  
		  Files.lines(p)
		  	   .distinct()
		       .sorted()
		       .forEach(System.out::println);
		  
	}

}
