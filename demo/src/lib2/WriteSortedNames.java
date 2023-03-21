package lib2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WriteSortedNames {

	public static void main(String[] args) throws Exception {
		var fw = new FileWriter("d:\\classroom\\feb2j\\sortednames.txt");
		var names = new TreeSet<String>();
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("Enter name [end to stop] :");
			var name = s.nextLine();
			if (name.equals("end"))
				break;
			names.add(name);
		}

		for(var name : names) {
			fw.write(name + "\n");
		}
			
		fw.close();
	}

}
