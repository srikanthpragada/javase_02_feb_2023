package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class FindStringInFile {

	public static void main(String[] args) throws Exception {
		String search = "test";

		Path p = Path.of("d:\\classroom\\feb2j\\test.txt");  // WindowsPath
		System.out.println(p.getClass());
		var contents = Files.readString(p);

		System.out.println(contents.contains(search));

	}

}
