package lib2;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteNames {

	public static void main(String[] args) throws Exception {
		var fw = new FileWriter("d:\\classroom\\feb2j\\names.txt");
		try (fw) {
			Scanner s = new Scanner(System.in);

			while (true) {
				System.out.print("Enter name [end to stop] :");
				var name = s.nextLine();
				if (name.equals("end"))
					break;

				fw.write(name + "\n");
			}
		} // try
	}
}
