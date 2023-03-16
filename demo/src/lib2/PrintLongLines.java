package lib2;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintLongLines {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("d:\\classroom\\feb2j\\test.txt");
		var br = new BufferedReader(fr);

		while (true) {
			var line = br.readLine();
			if (line == null)
				break;

			if (line.length() > 10)
				System.out.println(line);
		}

		fr.close();
		br.close();
	}
}
