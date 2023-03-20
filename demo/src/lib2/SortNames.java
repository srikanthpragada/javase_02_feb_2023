package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortNames {

	public static void main(String[] args) throws IOException {
		 
		  var p = Path.of("d:\\classroom\\feb2j\\names.txt");
		  var names = Files.readAllLines(p);
		  System.out.println(names.getClass());
		  names.sort(null);
		  
		  for (var line : names )
			  System.out.println(line);
	}

}
