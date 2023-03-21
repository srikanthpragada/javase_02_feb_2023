package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;

public class ListUniqueAndDuplicates {

	public static int countName(List<String> names, String name) {
		int count = 0;
		for (var n : names)
			if (n.equals(name))
				count++;

		return count;
	}

	public static void main(String[] args) throws IOException {

		var p = Path.of("d:\\classroom\\feb2j\\names.txt");

		var unames = new LinkedHashSet<String>();
		var dnames = new LinkedHashSet<String>();

		var names = Files.readAllLines(p);

		for (var name : names) {
			// count occurrences of name
			var count = countName(names, name);
			if (count == 1)
				unames.add(name);
			else
				dnames.add(name);
		}

		System.out.println("Unique Names");
		for (var name : unames) {
			System.out.println(name);
		}
		System.out.println("Duplicated Names");
		for (var name : dnames) {
			System.out.println(name);
		}
	}

}
