package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class ListPhoneDirectory {

	public static void main(String[] args) throws Exception {
		var p = Path.of("d:\\classroom\\feb2j\\phones.txt");
		var directory = new TreeMap<String, String>();
		
		for (var line : Files.readAllLines(p)) {
			var parts = line.split(",");
			if(parts.length < 2)
				continue;  // ignore line and continue 
			directory.put(parts[0],parts[1]);
		}
		
		for(var name : directory.keySet()) {
			System.out.printf("%-20s  %s\n", name, directory.get(name));
		}
		

	}

}
